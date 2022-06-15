package com.raz.linkApp.controllers;

import com.raz.linkApp.models.linkModel;
import com.raz.linkApp.services.LinksService;
import org.apache.tomcat.util.bcel.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LinksController {
    @Autowired
    LinksService linksService;
    private final  String PATH = "/links";
    @GetMapping(PATH)
    public ResponseEntity<List<linkModel>> getLinks(){
        System.out.println("LinksController : getLinks()");
        return new ResponseEntity(linksService.getAll(), HttpStatus.OK);
    }

    @GetMapping(PATH + "/{id}")
    public ResponseEntity<linkModel> getLinksByID(@PathVariable String id){
        System.out.println("LinksController : getLinksByID() -> " + id);
        Optional<linkModel> result = linksService.getById(id);
        return new ResponseEntity(
                result.isPresent()? result.get() : "Not Found",
                result.isPresent()? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
    @PostMapping(PATH)
    public ResponseEntity<linkModel> addLink(@RequestBody linkModel newLink){
        System.out.println("LinksController : addLink()");
        return new ResponseEntity<>(linksService.add(newLink), HttpStatus.OK);
    }
    @DeleteMapping(PATH + "/{id}")
    public void delete(@PathVariable String id){
        System.out.println("LinksController : delete() -> " + id);
        Boolean  result = this.linksService.delete(id);
    }
}

package com.raz.linkApp.services;

import com.raz.linkApp.models.linkModel;
import com.raz.linkApp.repositories.LinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LinksService {
    @Autowired
    LinksRepository linksRepository;

    public List<linkModel> getAll() {
        System.out.println("LinksService : getAll()");
       return this.linksRepository.findAll();
    }

    public Optional<linkModel> getById(String id) {
        System.out.println("LinksService : getAll()");
        return this.linksRepository.findById(id);
    }

    public linkModel add(linkModel newLink) {
        System.out.println("LinksService : add()");
        return this.linksRepository.insert(newLink);
    }
}

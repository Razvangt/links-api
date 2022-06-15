package com.raz.linkApp.repositories;

import com.raz.linkApp.models.linkModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinksRepository extends MongoRepository<linkModel,String> { }

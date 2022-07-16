package com.spring.artgallery.springboot.controllers;

import com.spring.artgallery.springboot.models.Collection;
import com.spring.artgallery.springboot.services.CollectionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CollectionController {
    private final CollectionService collectionService;

    public CollectionController(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @GetMapping("/collections")
    public List<Collection> findCollections() {
        return collectionService.listCollections();
    }
}

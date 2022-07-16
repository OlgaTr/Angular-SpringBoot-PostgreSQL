package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.models.Collection;
import com.spring.artgallery.springboot.repositories.CollectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionServiceImpl implements CollectionService{
    private final CollectionRepository collectionRepository;

    public CollectionServiceImpl(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    @Override
    public List<Collection> listCollections() {
        return collectionRepository.findAll();
    }
}

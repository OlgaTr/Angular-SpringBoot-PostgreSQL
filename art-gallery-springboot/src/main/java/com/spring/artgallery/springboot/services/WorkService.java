package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.entities.WorkEntity;
import com.spring.artgallery.springboot.models.Work;

import java.util.List;

public interface WorkService {
    List<Work> findAll();
    void addWork(long artistId, WorkEntity workEntity);
    void deleteWork(long workId);
    void deleteAll();
}

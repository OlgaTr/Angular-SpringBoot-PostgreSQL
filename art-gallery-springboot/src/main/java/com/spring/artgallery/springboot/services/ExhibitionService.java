package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.entities.ExhibitionEntity;

import java.util.List;

public interface ExhibitionService {
    List<ExhibitionEntity> listExhibitions();
}

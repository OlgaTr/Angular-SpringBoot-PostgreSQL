package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.models.Exhibition;

import java.util.List;

public interface ExhibitionService {
    List<Exhibition> listExhibitions();
    void addExhibition(Exhibition exhibition);
    void addWorksToExhibition(long exhibitionId, Long[] worksId);
    void deleteById(long exhibitionId);
}

package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.models.Exhibition;
import com.spring.artgallery.springboot.models.Work;

import java.util.List;

public interface ExhibitionService {
    List<Exhibition> listExhibitions();
    void addExhibition(Exhibition exhibition);
    void addWorksToExhibition(long exhibitionId, Long[] worksId);
}

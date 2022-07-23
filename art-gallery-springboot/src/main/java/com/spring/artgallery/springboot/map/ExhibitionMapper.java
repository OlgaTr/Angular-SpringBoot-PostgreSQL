package com.spring.artgallery.springboot.map;

import com.spring.artgallery.springboot.entities.ExhibitionEntity;
import com.spring.artgallery.springboot.models.Exhibition;

import java.util.Collections;

public class ExhibitionMapper {

    public static Exhibition exhibitionEntityToExhibition(ExhibitionEntity exhibitionEntity) {
        return new Exhibition(
                exhibitionEntity.getId(),
                exhibitionEntity.getTitle(),
                exhibitionEntity.getAuthor(),
                exhibitionEntity.getCreationDate(),
                exhibitionEntity.getDescription()
        );
    }

    public static ExhibitionEntity exhibitionToExhibitionEntity(Exhibition exhibition) {
        return new ExhibitionEntity(
                exhibition.getId(),
                exhibition.getTitle(),
                exhibition.getAuthor(),
                exhibition.getCreationDate(),
                exhibition.getDescription(),
                Collections.emptySet()
        );
    }
}

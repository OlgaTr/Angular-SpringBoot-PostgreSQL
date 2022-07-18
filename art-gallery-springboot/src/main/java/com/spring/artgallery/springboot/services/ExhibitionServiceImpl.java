package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.entities.ExhibitionEntity;
import com.spring.artgallery.springboot.repositories.ExhibitionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExhibitionServiceImpl implements ExhibitionService {
    private final ExhibitionRepository exhibitionRepository;

    public ExhibitionServiceImpl(ExhibitionRepository exhibitionRepository) {
        this.exhibitionRepository = exhibitionRepository;
    }

    @Override
    public List<ExhibitionEntity> listExhibitions() {
        return exhibitionRepository.findAll();
    }
}

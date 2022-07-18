package com.spring.artgallery.springboot.controllers;

import com.spring.artgallery.springboot.entities.ExhibitionEntity;
import com.spring.artgallery.springboot.services.ExhibitionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ExhibitionController {
    private final ExhibitionService exhibitionService;

    public ExhibitionController(ExhibitionService exhibitionService) {
        this.exhibitionService = exhibitionService;
    }

    @GetMapping("/exhibitions")
    public List<ExhibitionEntity> findExhibitions() {
        return exhibitionService.listExhibitions();
    }
}

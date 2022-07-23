package com.spring.artgallery.springboot.controllers;

import com.spring.artgallery.springboot.models.Exhibition;
import com.spring.artgallery.springboot.services.ExhibitionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ExhibitionController {
    private final ExhibitionService exhibitionService;

    public ExhibitionController(ExhibitionService exhibitionService) {
        this.exhibitionService = exhibitionService;
    }

    @GetMapping("/exhibitions")
    public List<Exhibition> findExhibitions() {
        return exhibitionService.listExhibitions();
    }

    @PostMapping("/exhibitions")
    public void createExhibition(@RequestBody Exhibition exhibition) {
        exhibitionService.addExhibition(exhibition);
    }

    @PutMapping("/exhibitions/{exhibitionId}")
    public void addWorkToExhibition(@PathVariable long exhibitionId, @RequestBody Long[] worksId) {
        exhibitionService.addWorksToExhibition(exhibitionId, worksId);
    }
}

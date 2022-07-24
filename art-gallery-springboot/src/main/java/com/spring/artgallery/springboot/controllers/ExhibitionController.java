package com.spring.artgallery.springboot.controllers;

import com.spring.artgallery.springboot.models.Exhibition;
import com.spring.artgallery.springboot.models.Work;
import com.spring.artgallery.springboot.services.ExhibitionService;
import com.spring.artgallery.springboot.services.WorkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ExhibitionController {
    private final ExhibitionService exhibitionService;
    private final WorkService workService;

    public ExhibitionController(ExhibitionService exhibitionService, WorkService workService) {
        this.exhibitionService = exhibitionService;
        this.workService = workService;
    }

    @GetMapping("/exhibitions")
    public List<Exhibition> findExhibitions() {
        return exhibitionService.listExhibitions();
    }

    @GetMapping("/exhibitions/{exhibitionId}")
    public List<Work> getWorksByExhibitionId(@PathVariable long exhibitionId) {
        return workService.getWorksByExhibitionId(exhibitionId);
    }

    @PostMapping("/exhibitions")
    public void createExhibition(@RequestBody Exhibition exhibition) {
        exhibitionService.addExhibition(exhibition);
    }

    @PutMapping("/exhibitions/{exhibitionId}")
    public void addWorkToExhibition(@PathVariable long exhibitionId, @RequestBody Long[] worksId) {
        exhibitionService.addWorksToExhibition(exhibitionId, worksId);
    }

    @DeleteMapping("/exhibitions/{exhibitionId}")
    public void deleteExhibitionById(@PathVariable long exhibitionId) {
        exhibitionService.deleteById(exhibitionId);
    }
}

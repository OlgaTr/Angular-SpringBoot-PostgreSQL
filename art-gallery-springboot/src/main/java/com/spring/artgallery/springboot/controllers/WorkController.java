package com.spring.artgallery.springboot.controllers;

import com.spring.artgallery.springboot.entities.WorkEntity;
import com.spring.artgallery.springboot.models.Work;
import com.spring.artgallery.springboot.services.WorkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class WorkController {
    private final WorkService workService;

    public WorkController(WorkService workService) {
        this.workService = workService;
    }

    @GetMapping("/works")
    public List<Work> findAll() {
        return workService.findAll();
    }

    @GetMapping("/works/{artistId}")
    public List<Work> getWorksByArtistId(@PathVariable long artistId) {
        return workService.getWorksByArtist(artistId);
    }

    @PostMapping("/works/{artistId}")
    public void addWork(@PathVariable long artistId, @RequestBody WorkEntity workEntity) {
        workService.addWork(artistId, workEntity);
    }

    @DeleteMapping("/works/{workId}")
    public void deleteWorkById(@PathVariable long workId) {
        workService.deleteById(workId);
    }
}

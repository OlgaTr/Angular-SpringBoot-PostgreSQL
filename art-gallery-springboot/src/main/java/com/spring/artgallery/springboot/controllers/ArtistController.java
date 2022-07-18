package com.spring.artgallery.springboot.controllers;

import com.spring.artgallery.springboot.entities.ArtistEntity;
import com.spring.artgallery.springboot.services.ArtistService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @PostMapping("/artists")
    public void addArtist(@RequestBody ArtistEntity artistEntity) {
        artistService.addArtist(artistEntity);
    }

    @DeleteMapping("/artists")
    public void deleteAll() {
        artistService.clearAll();
    }
}

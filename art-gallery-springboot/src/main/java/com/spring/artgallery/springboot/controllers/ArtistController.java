package com.spring.artgallery.springboot.controllers;

import com.spring.artgallery.springboot.entities.ArtistEntity;
import com.spring.artgallery.springboot.models.Artist;
import com.spring.artgallery.springboot.services.ArtistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/artists")
    public List<Artist> listArtists() {
        return artistService.findAll();
    }

    @GetMapping("/artists/{artistId}")
    public Artist getArtistById(@PathVariable long artistId) {
        return artistService.getArtistById(artistId);
    }

    @PostMapping("/artists")
    public void addArtist(@RequestBody ArtistEntity artistEntity) {
        artistService.addArtist(artistEntity);
    }

    @DeleteMapping("/artists/{artistId}")
    public void deleteArtistById(@PathVariable long artistId) {
        artistService.deleteById(artistId);
    }

    @DeleteMapping("/artists")
    public void deleteAll() {
        artistService.clearAll();
    }
}

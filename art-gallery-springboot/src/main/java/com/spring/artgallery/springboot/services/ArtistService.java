package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.entities.ArtistEntity;
import com.spring.artgallery.springboot.models.Artist;

import java.util.List;

public interface ArtistService {
    List<Artist> findAll();
    Artist getArtistById(long artistId);
    void addArtist(ArtistEntity artistEntity);
    void deleteById(long artistId);
    void clearAll();
}

package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.entities.ArtistEntity;

public interface ArtistService {
    void addArtist(ArtistEntity artistEntity);
    void clearAll();
}

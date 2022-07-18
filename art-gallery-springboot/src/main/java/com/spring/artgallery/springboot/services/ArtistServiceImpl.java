package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.entities.ArtistEntity;
import com.spring.artgallery.springboot.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtistServiceImpl implements ArtistService{
    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public void addArtist(ArtistEntity artistEntity) {
        artistRepository.saveAndFlush(artistEntity);
    }

    @Override
    public void clearAll() {
        artistRepository.deleteAll();
    }
}

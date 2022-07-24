package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.entities.ArtistEntity;
import com.spring.artgallery.springboot.map.ArtistMapper;
import com.spring.artgallery.springboot.models.Artist;
import com.spring.artgallery.springboot.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtistServiceImpl implements ArtistService{
    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> findAll() {
        return artistRepository.findAll().stream()
                .map(ArtistMapper:: artistEntityToArtist)
                .collect(Collectors.toList());
    }

    @Override
    public Artist getArtistById(long artistId) {
        return ArtistMapper.artistEntityToArtist(artistRepository.findById(artistId));
    }

    @Override
    public void addArtist(ArtistEntity artistEntity) {
        artistRepository.saveAndFlush(artistEntity);
    }

    @Override
    public void deleteById(long artistId) {
        artistRepository.deleteById(artistId);
    }

    @Override
    public void clearAll() {
        artistRepository.deleteAll();
    }
}

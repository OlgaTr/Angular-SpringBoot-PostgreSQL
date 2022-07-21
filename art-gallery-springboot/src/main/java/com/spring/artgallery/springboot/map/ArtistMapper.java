package com.spring.artgallery.springboot.map;

import com.spring.artgallery.springboot.entities.ArtistEntity;
import com.spring.artgallery.springboot.models.Artist;

public class ArtistMapper {

    public static Artist artistEntityToArtist(ArtistEntity artistEntity) {
        return new Artist(
                artistEntity.getId(),
                artistEntity.getFirstName(),
                artistEntity.getLastName()
        );
    }
}

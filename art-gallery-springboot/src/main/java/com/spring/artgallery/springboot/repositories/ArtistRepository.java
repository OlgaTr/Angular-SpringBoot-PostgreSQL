package com.spring.artgallery.springboot.repositories;

import com.spring.artgallery.springboot.entities.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<ArtistEntity, Long> {
    ArtistEntity findById(long id);
}

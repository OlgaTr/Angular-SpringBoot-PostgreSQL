package com.spring.artgallery.springboot.repositories;

import com.spring.artgallery.springboot.models.Collection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionRepository extends JpaRepository<Collection, Long> {
}

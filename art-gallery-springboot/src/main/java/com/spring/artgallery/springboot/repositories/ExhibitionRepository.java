package com.spring.artgallery.springboot.repositories;

import com.spring.artgallery.springboot.entities.ExhibitionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExhibitionRepository extends JpaRepository<ExhibitionEntity, Long> {
}

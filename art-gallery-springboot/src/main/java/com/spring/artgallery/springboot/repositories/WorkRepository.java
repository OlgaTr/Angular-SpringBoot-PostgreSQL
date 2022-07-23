package com.spring.artgallery.springboot.repositories;

import com.spring.artgallery.springboot.entities.WorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<WorkEntity, Long> {
    WorkEntity findById(long id);
}

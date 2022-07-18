package com.spring.artgallery.springboot.map;

import com.spring.artgallery.springboot.entities.WorkEntity;
import com.spring.artgallery.springboot.models.Work;
import com.spring.artgallery.springboot.repositories.ArtistRepository;
import org.springframework.stereotype.Component;

@Component
public class WorkMapper {
    private final ArtistRepository artistRepository;

    public WorkMapper(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public WorkEntity WorkToWorkEntity(Work work) {
        WorkEntity workEntity = new WorkEntity(
                work.getId(),
                artistRepository.findById(work.getAuthorId()),
                work.getTitle()
        );
        return workEntity;
    }

    public Work WorkEntityToWork(WorkEntity workEntity) {
        Work work = new Work(
                workEntity.getId(),
                workEntity.getArtist().getId(),
                workEntity.getTitle()
        );
        return work;
    }
}

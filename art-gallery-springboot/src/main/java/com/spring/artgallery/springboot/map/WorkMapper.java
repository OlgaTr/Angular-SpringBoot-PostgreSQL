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

    public WorkEntity workToWorkEntity(Work work) {
        WorkEntity workEntity = new WorkEntity(
                work.getId(),
                artistRepository.findById(work.getArtist().getId()),
                work.getTitle(),
                work.getCreationDate(),
                work.getDescription()
        );
        return workEntity;
    }

    public Work workEntityToWork(WorkEntity workEntity) {
        Work work = new Work(
                workEntity.getId(),
                ArtistMapper.artistEntityToArtist(workEntity.getArtist()),
                workEntity.getTitle(),
                workEntity.getCreationDate(),
                workEntity.getDescription()
        );
        return work;
    }
}

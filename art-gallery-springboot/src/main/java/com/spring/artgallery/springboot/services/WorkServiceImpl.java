package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.entities.ArtistEntity;
import com.spring.artgallery.springboot.entities.WorkEntity;
import com.spring.artgallery.springboot.map.WorkMapper;
import com.spring.artgallery.springboot.models.Work;
import com.spring.artgallery.springboot.repositories.ArtistRepository;
import com.spring.artgallery.springboot.repositories.WorkRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkServiceImpl implements WorkService{
    private final WorkRepository workRepository;
    private final ArtistRepository artistRepository;
    private final WorkMapper workMapper;

    public WorkServiceImpl(WorkRepository workRepository, ArtistRepository artistRepository, WorkMapper workMapper) {
        this.workRepository = workRepository;
        this.artistRepository = artistRepository;
        this.workMapper = workMapper;
    }

    @Override
    public List<Work> findAll() {
        return workRepository.findAll().stream()
                .map(workMapper::workEntityToWork)
                .collect(Collectors.toList());
    }

    @Override
    public void addWork(long artistId, WorkEntity workEntity) {
        ArtistEntity artistEntity = artistRepository.findById(artistId);
        artistEntity.addWork(workEntity);
        workEntity.setArtist(artistEntity);
        artistRepository.saveAndFlush(artistEntity);
        workRepository.saveAndFlush(workEntity);
    }

    @Override
    public void deleteWork(long workId) {

    }

    @Override
    public void deleteAll() {

    }
}
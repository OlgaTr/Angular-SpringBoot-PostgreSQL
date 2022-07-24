package com.spring.artgallery.springboot.services;

import com.spring.artgallery.springboot.entities.ExhibitionEntity;
import com.spring.artgallery.springboot.map.ExhibitionMapper;
import com.spring.artgallery.springboot.models.Exhibition;
import com.spring.artgallery.springboot.repositories.ExhibitionRepository;
import com.spring.artgallery.springboot.repositories.WorkRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExhibitionServiceImpl implements ExhibitionService {
    private final ExhibitionRepository exhibitionRepository;
    private final WorkRepository workRepository;

    public ExhibitionServiceImpl(ExhibitionRepository exhibitionRepository, WorkRepository workRepository) {
        this.exhibitionRepository = exhibitionRepository;
        this.workRepository = workRepository;
    }

    @Override
    public List<Exhibition> listExhibitions() {
        return exhibitionRepository.findAll().stream()
                .map(ExhibitionMapper::exhibitionEntityToExhibition)
                .collect(Collectors.toList());
    }

    @Override
    public void addExhibition(Exhibition exhibition) {
        ExhibitionEntity exhibitionEntity = ExhibitionMapper.exhibitionToExhibitionEntity(exhibition);
        exhibitionEntity.setCreationDate(LocalDate.now());
        exhibitionRepository.saveAndFlush(exhibitionEntity);
    }

    @Override
    public void addWorksToExhibition(long exhibitionId, Long[] worksId) {
        ExhibitionEntity exhibition = exhibitionRepository.findById(exhibitionId);
        Arrays.stream(worksId)
                .map(workRepository::findById)
                .forEach(work -> exhibition.addWorkToExhibition(work.get()));
        exhibitionRepository.saveAndFlush(exhibition);
    }

    @Override
    public void deleteById(long exhibitionId) {
        exhibitionRepository.deleteById(exhibitionId);
    }
}

package com.spring.artgallery.springboot.repositories;

import com.spring.artgallery.springboot.entities.WorkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkRepository extends JpaRepository<WorkEntity, Long> {
    WorkEntity findById(long id);

    @Query(value = "select * from works where artist_id = :artistId", nativeQuery = true)
    List<WorkEntity> findByArtistId(long artistId);

    @Query(value = "select * from works left join exhibition_work on works.id=exhibition_work.work_id where exhibition_id = :exhibitionId", nativeQuery = true)
    List<WorkEntity> findByExhibitionId(long exhibitionId);
}

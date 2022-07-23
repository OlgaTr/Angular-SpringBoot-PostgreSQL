package com.spring.artgallery.springboot.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "works")
public class WorkEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artist_id")
    private ArtistEntity artistEntity;
    private String title;
    private String creationDate;
    private String description;

    @ManyToMany(mappedBy = "works")
    private Set<ExhibitionEntity> exhibitionEntities = new HashSet<>();

    public WorkEntity() {
    }

    public WorkEntity(long id, ArtistEntity artistEntity, String title, String creationDate, String description) {
        this.id = id;
        this.artistEntity = artistEntity;
        this.title = title;
        this.creationDate = creationDate;
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public ArtistEntity getArtist() {
        return artistEntity;
    }

    public String getTitle() {
        return title;
    }

    public void setArtist(ArtistEntity artistEntity) {
        this.artistEntity = artistEntity;
    }

    public ArtistEntity getArtistEntity() {
        return artistEntity;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "WorkEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

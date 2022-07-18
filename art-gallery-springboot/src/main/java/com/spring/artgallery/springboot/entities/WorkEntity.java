package com.spring.artgallery.springboot.entities;

import javax.persistence.*;

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

    public WorkEntity() {
    }

    public WorkEntity(long id, ArtistEntity artistEntity, String title) {
        this.id = id;
        this.artistEntity = artistEntity;
        this.title = title;
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

    @Override
    public String toString() {
        return "WorkEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}

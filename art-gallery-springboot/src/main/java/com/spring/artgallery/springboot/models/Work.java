package com.spring.artgallery.springboot.models;

public class Work {
    private long id;
    private Artist artist;
    private String title;
    private String creationDate;
    private String description;

    public Work(long id, Artist artist, String title, String creationDate, String description) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.creationDate = creationDate;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getDescription() {
        return description;
    }
}

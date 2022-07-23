package com.spring.artgallery.springboot.models;

import java.time.LocalDate;

public class Exhibition {
    private long id;
    private String title;
    private String author;
    private LocalDate creationDate;
    private String description;

    public Exhibition(long id, String title, String author, LocalDate creationDate, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.creationDate = creationDate;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}

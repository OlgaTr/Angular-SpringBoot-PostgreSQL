package com.spring.artgallery.springboot.models;

public class Work {
    private long id;
    private long authorId;
    private String title;
    private String creationDate;
    private String description;

    public Work(long id, long authorId, String title, String creationDate, String description) {
        this.id = id;
        this.authorId = authorId;
        this.title = title;
        this.creationDate = creationDate;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public long getAuthorId() {
        return authorId;
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

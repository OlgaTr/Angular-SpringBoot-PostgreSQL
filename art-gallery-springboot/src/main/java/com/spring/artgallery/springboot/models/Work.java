package com.spring.artgallery.springboot.models;

public class Work {
    private long id;
    private long authorId;
    private String title;

    public Work(long id, long authorId, String title) {
        this.id = id;
        this.authorId = authorId;
        this.title = title;
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
}

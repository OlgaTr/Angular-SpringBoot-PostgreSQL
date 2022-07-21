package com.spring.artgallery.springboot.models;

public class Artist {
    private long id;
    private String firstName;
    private String lastName;

    public Artist(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

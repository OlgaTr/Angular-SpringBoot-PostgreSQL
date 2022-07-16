package com.spring.artgallery.springboot.models;

import javax.persistence.*;

@Entity
@Table(name = "collections")
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}

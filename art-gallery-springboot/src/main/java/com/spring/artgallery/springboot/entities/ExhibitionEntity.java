package com.spring.artgallery.springboot.entities;

import javax.persistence.*;

@Entity
@Table(name = "exhibitions")
public class ExhibitionEntity {

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

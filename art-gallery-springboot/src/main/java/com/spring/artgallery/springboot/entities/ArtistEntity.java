package com.spring.artgallery.springboot.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "artists")
public class ArtistEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL,
                mappedBy = "artistEntity",
                orphanRemoval = true)
    private Set<WorkEntity> workEntities = new HashSet<>();

    public void setId(long id) {
        this.id = id;
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

    public Set<WorkEntity> getWorks() {
        return workEntities;
    }

    public void addWork(WorkEntity workEntity) {
        this.workEntities.add(workEntity);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

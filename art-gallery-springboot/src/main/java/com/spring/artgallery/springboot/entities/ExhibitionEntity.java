package com.spring.artgallery.springboot.entities;

import com.spring.artgallery.springboot.models.Work;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "exhibitions")
public class ExhibitionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private LocalDate creationDate;
    private String description;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name="exhibition_work",
            joinColumns = @JoinColumn(name = "exhibition_id"),
            inverseJoinColumns = @JoinColumn(name = "work_id")
    )
    private Set<WorkEntity> works = new HashSet<>();

    public ExhibitionEntity() {
    }

    public ExhibitionEntity(long id, String title, String author, LocalDate creationDate, String description, Set<WorkEntity> works) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.creationDate = creationDate;
        this.description = description;
        this.works = works;
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

    public void setCreationDate(LocalDate date) {
        this.creationDate = date;
    }

    public void addWorkToExhibition(WorkEntity workEntity) {
        this.works.add(workEntity);
    }

    @Override
    public String toString() {
        return "ExhibitionEntity{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", date=" + creationDate +
                '}';
    }
}

package com.sakila.rest.entities;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
    @Table(name = "film")
public class Film {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "film_id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    public Film() {
    }

    public Film(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

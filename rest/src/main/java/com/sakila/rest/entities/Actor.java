package com.sakila.rest.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
    @Table(name ="actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="actor_id")
    private int id;

    @Column(name ="first_name")
    private String first_name;

    @Column(name ="last_name")
    private String name;

    @Column(name ="last_update")
    private LocalDate last_update;

    public Actor() {}

    public Actor(int id, String first_name, String last_name, LocalDate last_update) {
        this.id = id;
        this.first_name = first_name;
        this.name = name;
        this.last_update = last_update;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return name;
    }

    public void setLast_name(String last_name) {
        this.name = name;
    }

    public LocalDate getLast_update() {
        return last_update;
    }

    public void setLast_update(LocalDate last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + name + '\'' +
                ", last_update=" + last_update +
                '}';
    }
}

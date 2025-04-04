package com.sakila.rest.repositories;

import com.sakila.rest.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    List<Actor> findActorByNameContains(String name);

}

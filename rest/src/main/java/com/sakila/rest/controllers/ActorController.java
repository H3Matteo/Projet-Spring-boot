package com.sakila.rest.controllers;

import com.sakila.rest.entities.Actor;
import com.sakila.rest.repositories.ActorRepository;
import com.sakila.rest.services.ActorService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/actor")
public class ActorController {

    private final ActorService actorService;
    public ActorController(ActorService actorService) {this.actorService = actorService;}

    @GetMapping("/all")
    public List<Actor> readAll() {return actorService.readAll();}

    @GetMapping("{name}")
    public List<Actor> searchByName(@PathVariable("name") String name){
        return actorService.searchByName(name);
    }

}

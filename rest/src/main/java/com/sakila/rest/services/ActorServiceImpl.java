package com.sakila.rest.services;

import com.sakila.rest.entities.Actor;
import com.sakila.rest.repositories.ActorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    private static final Logger logger = LoggerFactory.getLogger(ActorServiceImpl.class);

    private  final ActorRepository actorRepository;

    public ActorServiceImpl(ActorRepository actorRepository) {this.actorRepository = actorRepository;}

    @Override
    public Actor create(Actor obj) {
        return null;
    }

    @Override
    public Actor read(Integer id) {
        return null;
    }

    @Override
    public Actor update(Actor obj) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Actor> readAll() {
        return actorRepository.findAll();
    }

    @Override
    public List<Actor> searchByName(String name) {
        return actorRepository.findActorByNameContains(name);
    }
}

package com.sakila.rest.services;

import com.sakila.rest.entities.Actor;

import java.util.List;

public interface ActorService extends IService<Actor, Integer>{
    List<Actor> searchByName(String name);

}

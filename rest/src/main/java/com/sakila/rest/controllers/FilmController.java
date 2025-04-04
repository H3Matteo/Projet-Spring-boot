package com.sakila.rest.controllers;

import com.sakila.rest.entities.Film;
import com.sakila.rest.services.FilmService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/films")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/all")
    public List<Film> getAllFilms() {
        return filmService.readAll();
    }

    @GetMapping("/title/{name}")
    public Film getFilmByName(@PathVariable String name){ return filmService.FindFilmByName(name);}
}

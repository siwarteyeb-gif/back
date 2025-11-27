package com.siwar.demo.restcontrollers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.siwar.demo.entities.Genre;
import com.siwar.demo.repos.GenreRepository;

@RestController
@RequestMapping("/api/gen")  // Base URL
@CrossOrigin("*")
public class GenreRestController {

    @Autowired
    private GenreRepository genreRepository;

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }


    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable("id") Integer id) {
        Optional<Genre> genre = genreRepository.findById(id);
        return genre.orElse(null);
    }

    @PostMapping
    public Genre createGenre(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }

    @PutMapping
    public Genre updateGenre(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }

    @DeleteMapping("/{id}")
    public void deleteGenre(@PathVariable("id") Integer id) {
        genreRepository.deleteById(id);
    }
}

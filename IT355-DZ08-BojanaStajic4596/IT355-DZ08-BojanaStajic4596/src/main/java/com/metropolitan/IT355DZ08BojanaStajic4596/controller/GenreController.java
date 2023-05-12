package com.metropolitan.IT355DZ08BojanaStajic4596.controller;


import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Genre;
import com.metropolitan.IT355DZ08BojanaStajic4596.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping("/genre")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;
    @GetMapping
    public ResponseEntity<List<Genre>> getAll() {
        return ResponseEntity.ok(genreService.findAll());
    }
    @GetMapping("/{genre_id}")
    public ResponseEntity<Genre> getById(@PathVariable Integer genre_id)
    {
        return ResponseEntity.ok(genreService.findById(genre_id)
                .orElseThrow(() -> new
                        ResponseStatusException(HttpStatus.NOT_FOUND, "GenreNotFound")));
    }
    @PostMapping
    public ResponseEntity<Genre> save(@RequestBody Genre genre) {
        return ResponseEntity.ok(genreService.save(genre));
    }
    @PutMapping
    public ResponseEntity<Genre> update(@RequestBody Genre genre)
    {
        return ResponseEntity.ok(genreService.update(genre));
    }
    @DeleteMapping("/{genre_id}")
    public ResponseEntity<Genre> deleteById(@PathVariable Integer
                                                      genre_id) {
        genreService.deleteById(genre_id);
        return ResponseEntity.ok().build();
    }
    //zanrovi po nazivu
    @GetMapping("/genre_name")
    public ResponseEntity<List<Genre>> getByGenreName(@RequestParam
                                                            String genre_name) {
        return ResponseEntity.ok(genreService.findByGenreName(genre_name));
    }

}

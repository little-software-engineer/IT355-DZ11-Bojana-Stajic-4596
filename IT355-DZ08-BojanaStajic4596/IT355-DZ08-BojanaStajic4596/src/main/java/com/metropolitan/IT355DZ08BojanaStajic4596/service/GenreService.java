package com.metropolitan.IT355DZ08BojanaStajic4596.service;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {

    List<Genre> findAll();
    Optional<Genre> findById(Integer genre_id);
    Genre save(Genre genre);
    Genre update(Genre genre);
    void deleteById(Integer genre_id);
    List<Genre> findByGenreName(String genre_name);
}

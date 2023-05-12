package com.metropolitan.IT355DZ08BojanaStajic4596.repository;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {
    List<Genre> findByGenreName(String genre_name);
}

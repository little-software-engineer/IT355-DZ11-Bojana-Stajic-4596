package com.metropolitan.IT355DZ08BojanaStajic4596.service;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Genre;
import com.metropolitan.IT355DZ08BojanaStajic4596.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService{

    private final GenreRepository genreRepository;
    @Override
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }
    @Override
    public Optional<Genre> findById(Integer genre_id) {
        return genreRepository.findById(genre_id);
    }
    @Override
    public Genre save(Genre genre) {
        return genreRepository.save(genre);
    }
    @Override
    public Genre update(Genre genre) {
        return genreRepository.save(genre);
    }
    @Override
    public void deleteById(Integer genre_id) {
        genreRepository.deleteById(genre_id);
    }
    @Override
    public List<Genre> findByGenreName(String genre_name) {
        return genreRepository.findByGenreName(genre_name);
    }
    
    
}

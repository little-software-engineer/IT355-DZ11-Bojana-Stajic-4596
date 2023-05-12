package com.metropolitan.IT355DZ08BojanaStajic4596.repository;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findByTitle(String title);

    List<Movie> findByRuntime(int runtime);

    List<Movie> findByOverview(String overview);

    List<Movie> findByBudget(int budget);

    @Query(value = "SELECT * FROM Movie WHERE vote_average > :vote_average", nativeQuery = true)
            List<Movie> findByVoteAboveSix(@Param("vote_average") int vote_average);

    @Query(value = "SELECT * FROM Movie WHERE popularity <= :popularity", nativeQuery = true)
    List<Movie> findByPopularity(@Param("popularity") double popularity);



}

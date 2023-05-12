package com.metropolitan.IT355DZ08BojanaStajic4596.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Movie {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "movie_id")
    private int movieId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "budget")
    private Integer budget;
    @Basic
    @Column(name = "homepage")
    private String homepage;
    @Basic
    @Column(name = "overview")
    private String overview;
    @Basic
    @Column(name = "popularity")
    private BigDecimal popularity;
    @Basic
    @Column(name = "release_date")
    private Date releaseDate;
    @Basic
    @Column(name = "revenue")
    private Long revenue;
    @Basic
    @Column(name = "runtime")
    private Integer runtime;
    @Basic
    @Column(name = "movie_status")
    private String movieStatus;
    @Basic
    @Column(name = "tagline")
    private String tagline;
    @Basic
    @Column(name = "vote_average")
    private BigDecimal voteAverage;
    @Basic
    @Column(name = "vote_count")
    private Integer voteCount;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public BigDecimal getPopularity() {
        return popularity;
    }

    public void setPopularity(BigDecimal popularity) {
        this.popularity = popularity;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(String movieStatus) {
        this.movieStatus = movieStatus;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public BigDecimal getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(BigDecimal voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return movieId == movie.movieId && Objects.equals(title, movie.title) && Objects.equals(budget, movie.budget) && Objects.equals(homepage, movie.homepage) && Objects.equals(overview, movie.overview) && Objects.equals(popularity, movie.popularity) && Objects.equals(releaseDate, movie.releaseDate) && Objects.equals(revenue, movie.revenue) && Objects.equals(runtime, movie.runtime) && Objects.equals(movieStatus, movie.movieStatus) && Objects.equals(tagline, movie.tagline) && Objects.equals(voteAverage, movie.voteAverage) && Objects.equals(voteCount, movie.voteCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, title, budget, homepage, overview, popularity, releaseDate, revenue, runtime, movieStatus, tagline, voteAverage, voteCount);
    }
}

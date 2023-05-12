package com.metropolitan.IT355DZ08BojanaStajic4596.controller;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.*;
import com.metropolitan.IT355DZ08BojanaStajic4596.repository.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    
    private final DepartmentRepository departmentRepository;
private final PersonRepository personRepository;
private final GenreRepository genreRepository;
private final CountryRepository countryRepository;
private final MovieRepository movieRepository;

    public MainController(DepartmentRepository departmentRepository, PersonRepository personRepository, GenreRepository genreRepository, CountryRepository countryRepository, MovieRepository movieRepository) {
        this.departmentRepository = departmentRepository;
        this.personRepository = personRepository;
        this.genreRepository = genreRepository;
        this.countryRepository = countryRepository;
        this.movieRepository = movieRepository;
    }

    @GetMapping("/departments")
    public String getDepartments() {
        System.out.println("Find a department with the name Directing");
        for (Department d : departmentRepository.findByDepartmentName("Directing")) {
            System.out.println(d.getDepartmentName());
        }
        System.out.println("---------------------------------------------------------------- ");
        return "index";
    }

    @GetMapping("/people")
    public String getPersons() {
        System.out.println("Find people with the name Harrison Ford");
        for (Person p : personRepository.findByPersonName("Harrison Ford")) {
            System.out.println(p.getPersonName());
        }
        System.out.println("---------------------------------------------------------------- ");
        return "index";
    }


    @GetMapping("/genres")
    public String getGenres() {
        System.out.println("Find a genre with the name Action");
        for (Genre g : genreRepository.findByGenreName("Action")) {
            System.out.println(g.getGenreName());
        }
        System.out.println("---------------------------------------------------------------- ");
        return "index";
    }
    @GetMapping("/countries")
    public String getCountries() {
        System.out.println("Find a country with the name Germany");
        for (Country c : countryRepository.findByCountryName("Germany")) {
            System.out.println(c.getCountryName() + " " + c.getCountryIsoCode());
        }
        System.out.println("---------------------------------------------------------------- ");

        System.out.println("Find a country with ISO code BS");
        for (Country c : countryRepository.findByCountryIsoCode("BS")) {
            System.out.println(c.getCountryName() + " "+c.getCountryIsoCode());
        }
        System.out.println("---------------------------------------------------------------- ");

        return "index";
    }

    @GetMapping("/movies")
    public String getMovies() {
        System.out.println("Find a movie with the title Four Rooms");
        for (Movie m : movieRepository.findByTitle("Four rooms")) {
            System.out.println(m.getTitle() + " " + m.getReleaseDate());
        }
        System.out.println("---------------------------------------------------------------- ");

        System.out.println("Find a movie with a runtime 143");
        for (Movie m : movieRepository.findByRuntime(143)) {
            System.out.println(m.getTitle() + " " + m.getReleaseDate() + " " + m.getRuntime());
        }
        System.out.println("---------------------------------------------------------------- ");


        System.out.println("Find a movie by overview");
        for (Movie m : movieRepository.findByOverview("Captain Jack Sparrow works his way out of a blood debt with the ghostly Davey Jones, he also attempts to avoid eternal damnation.")) {
            System.out.println(m.getTitle() + " " + m.getReleaseDate() + " " + m.getOverview());
        }
        System.out.println("---------------------------------------------------------------- ");


        System.out.println("Find a movie with a budget of 4000000");
        for (Movie m : movieRepository.findByBudget(4000000)) {
            System.out.println(m.getTitle() + " " + m.getReleaseDate() + " " + m.getBudget());
        }
        System.out.println("---------------------------------------------------------------- ");

        System.out.println("Find a movie by vote");
        for (Movie m : movieRepository.findByVoteAboveSix(6)) {
            System.out.println(m.getTitle() + " " + m.getReleaseDate() + " " + m.getBudget() + " " + m.getVoteAverage());
        }
        System.out.println("---------------------------------------------------------------- ");

        System.out.println("Find a movie by popularity");
        for (Movie m : movieRepository.findByPopularity(126.393695)) {
            System.out.println(m.getTitle() + " " + m.getReleaseDate() + " " + m.getBudget() + " " + m.getVoteAverage() + " " + m.getPopularity());
        }
        System.out.println("---------------------------------------------------------------- ");
        return "index";
    }


}

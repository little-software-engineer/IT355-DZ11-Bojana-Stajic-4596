package com.metropolitan.IT355DZ08BojanaStajic4596.controller;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Country;
import com.metropolitan.IT355DZ08BojanaStajic4596.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping("/country")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;
    @GetMapping
    public ResponseEntity<List<Country>> getAll() {
        return ResponseEntity.ok(countryService.findAll());
    }
    @GetMapping("/{country_id}")
    public ResponseEntity<Country> getById(@PathVariable Integer country_id)
    {
        return ResponseEntity.ok(countryService.findById(country_id)
                .orElseThrow(() -> new
                        ResponseStatusException(HttpStatus.NOT_FOUND, "CountryNotFound")));
    }
    @PostMapping
    public ResponseEntity<Country> save(@RequestBody Country country) {
        return ResponseEntity.ok(countryService.save(country));
    }
    @PutMapping
    public ResponseEntity<Country> update(@RequestBody Country country)
    {
        return ResponseEntity.ok(countryService.update(country));
    }
    @DeleteMapping("/{country_id}")
    public ResponseEntity<Country> deleteById(@PathVariable Integer
                                                          country_id) {
        countryService.deleteById(country_id);
        return ResponseEntity.ok().build();
    }
    //zemlje po nazivu
    @GetMapping("/country_id")
    public ResponseEntity<List<Country>> getByCountryName(@RequestParam
                                                                String country_name) {
        return ResponseEntity.ok(countryService.findByCountryName(country_name));
    }
}

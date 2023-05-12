package com.metropolitan.IT355DZ08BojanaStajic4596.service;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    List<Country> findAll();
    Optional<Country> findById(Integer country_id);
    Country save(Country country);
    Country update(Country country);
    void deleteById(Integer country_id);
    List<Country> findByCountryName(String country_name);

}

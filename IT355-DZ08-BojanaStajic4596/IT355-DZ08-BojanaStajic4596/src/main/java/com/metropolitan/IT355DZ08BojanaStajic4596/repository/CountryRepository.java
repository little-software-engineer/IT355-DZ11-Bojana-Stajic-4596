package com.metropolitan.IT355DZ08BojanaStajic4596.repository;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

    List<Country> findByCountryName(String country_name);

    List<Country> findByCountryIsoCode(String country_iso_code);



}

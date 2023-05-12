package com.metropolitan.IT355DZ08BojanaStajic4596.service;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Country;
import com.metropolitan.IT355DZ08BojanaStajic4596.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;
    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
    @Override
    public Optional<Country> findById(Integer country_id) {
        return countryRepository.findById(country_id);
    }
    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }
    @Override
    public Country update(Country country) {
        return countryRepository.save(country);
    }
    @Override
    public void deleteById(Integer country_id) {
        countryRepository.deleteById(country_id);
    }
    @Override
    public List<Country> findByCountryName(String country_name) {
        return countryRepository.findByCountryName(country_name);
    }


}

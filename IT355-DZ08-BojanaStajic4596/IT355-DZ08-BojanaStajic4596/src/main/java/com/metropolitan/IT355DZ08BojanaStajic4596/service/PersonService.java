package com.metropolitan.IT355DZ08BojanaStajic4596.service;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    List<Person> findAll();
    Optional<Person> findById(Integer person_id);
    Person save(Person person);
    Person update(Person person);
    void deleteById(Integer person_id);
    List<Person> findByPersonName(String person_name);
}

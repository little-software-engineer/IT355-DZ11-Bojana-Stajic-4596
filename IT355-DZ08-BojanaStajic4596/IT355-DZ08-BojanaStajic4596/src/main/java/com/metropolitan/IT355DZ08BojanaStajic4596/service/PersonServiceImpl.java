package com.metropolitan.IT355DZ08BojanaStajic4596.service;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Person;
import com.metropolitan.IT355DZ08BojanaStajic4596.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{

    private final PersonRepository personRepository;
    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }
    @Override
    public Optional<Person> findById(Integer person_id) {
        return personRepository.findById(person_id);
    }
    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }
    @Override
    public Person update(Person person) {
        return personRepository.save(person);
    }
    @Override
    public void deleteById(Integer person_id) {
        personRepository.deleteById(person_id);
    }
    @Override
    public List<Person> findByPersonName(String person_name) {
        return personRepository.findByPersonName(person_name);
    }

}

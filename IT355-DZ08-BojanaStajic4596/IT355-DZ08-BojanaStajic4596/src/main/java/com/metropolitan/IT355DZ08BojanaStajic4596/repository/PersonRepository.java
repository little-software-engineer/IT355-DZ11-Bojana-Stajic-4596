package com.metropolitan.IT355DZ08BojanaStajic4596.repository;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByPersonName(String person_name);

}

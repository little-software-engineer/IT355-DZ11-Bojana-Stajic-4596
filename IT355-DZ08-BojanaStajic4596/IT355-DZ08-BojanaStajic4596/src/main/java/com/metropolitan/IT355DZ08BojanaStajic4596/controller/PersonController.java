package com.metropolitan.IT355DZ08BojanaStajic4596.controller;

import com.metropolitan.IT355DZ08BojanaStajic4596.entity.Person;
import com.metropolitan.IT355DZ08BojanaStajic4596.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;
    @GetMapping
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok(personService.findAll());
    }
    @GetMapping("/{person_id}")
    public ResponseEntity<Person> getById(@PathVariable Integer person_id)
    {
        return ResponseEntity.ok(personService.findById(person_id)
                .orElseThrow(() -> new
                        ResponseStatusException(HttpStatus.NOT_FOUND, "PersonNotFound")));
    }
    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person) {
        return ResponseEntity.ok(personService.save(person));
    }
    @PutMapping
    public ResponseEntity<Person> update(@RequestBody Person person)
    {
        return ResponseEntity.ok(personService.update(person));
    }
    @DeleteMapping("/{person_id}")
    public ResponseEntity<Person> deleteById(@PathVariable Integer
                                                      person_id) {
        personService.deleteById(person_id);
        return ResponseEntity.ok().build();
    }
    //glumci po nazivu
    @GetMapping("/person_name")
    public ResponseEntity<List<Person>> getByPersonName(@RequestParam
                                                            String person_name) {
        return ResponseEntity.ok(personService.findByPersonName(person_name));
    }
}

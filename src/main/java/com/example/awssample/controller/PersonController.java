package com.example.awssample.controller;

import com.example.awssample.entity.Person;
import com.example.awssample.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public Person save(Person person) {
        return personService.add(person);
    }

    @GetMapping
    public Person findById(String id) {
        return personService.findById(id);
    }

    @DeleteMapping
    public Person delete(String id) {
        return personService.delete(id);
    }

    @PutMapping
    public Person update(Person person) {
        return personService.update(person);
    }
}

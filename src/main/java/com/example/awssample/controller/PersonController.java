package com.example.awssample.controller;

import com.example.awssample.entity.Person;
import com.example.awssample.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public Person save(Person person) {
        return personService.add(person);
    }

    @PostMapping
    public Person findById(String id) {
        return personService.findById(id);
    }

    @PostMapping
    public Person delete(String id) {
        return personService.delete(id);
    }
}

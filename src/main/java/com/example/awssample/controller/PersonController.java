package com.example.awssample.controller;

import com.example.awssample.entity.Person;
import com.example.awssample.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public Person save(@RequestBody Person person) {
        return personService.add(person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable String id) {
        return personService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        return personService.delete(id);
    }

    @PutMapping
    public String update(@RequestBody Person person) {
        return personService.update(person);
    }
}

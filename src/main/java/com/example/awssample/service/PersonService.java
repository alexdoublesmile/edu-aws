package com.example.awssample.service;

import com.example.awssample.entity.Person;
import com.example.awssample.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person add(Person person) {
        return null;
    }

    public Person findById(String id) {
        return null;
    }

    public Person delete(String id) {
        return null;
    }

    public Person update(Person person) {
        return null;
    }
}

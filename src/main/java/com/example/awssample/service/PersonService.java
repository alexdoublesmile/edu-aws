package com.example.awssample.service;

import com.example.awssample.entity.Person;
import com.example.awssample.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person add(Person person) {
        return personRepository.addPerson(person);
    }

    public Person findById(String id) {
        return personRepository.findById(id);
    }

    public String delete(String id) {
        return personRepository.delete(id);
    }

    public String update(Person person) {
        return personRepository.update(person);
    }
}

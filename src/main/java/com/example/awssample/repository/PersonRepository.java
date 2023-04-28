package com.example.awssample.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.example.awssample.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PersonRepository {
    private final DynamoDBMapper mapper;

    public Person addPerson(Person person) {
        mapper.save(person);
        return person;
    }

    public Person findById(String id) {
        return mapper.load(Person.class, id);
    }

    public String delete(String id) {
        mapper.delete(id);
        return "Person removed";
    }

    public String update(Person person) {
        mapper.save(person, buildExpresion(person));
        return "Person updated";
    }
}

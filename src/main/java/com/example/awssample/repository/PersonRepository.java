package com.example.awssample.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.example.awssample.entity.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Log4j2
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

    private DynamoDBSaveExpression buildExpresion(Person person) {
        final DynamoDBSaveExpression expression = new DynamoDBSaveExpression();
        final HashMap<String, ExpectedAttributeValue> expectedAttributesMap = new HashMap<>();
        expectedAttributesMap.put("personId", new ExpectedAttributeValue(
                new AttributeValue().withS(person.getId())
        ));
        expression.setExpected(expectedAttributesMap);

        return expression;
    }
}

package com.example.awssample.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import java.io.Serializable;

@DynamoDBDocument
public class Person implements Serializable {

    @DynamoDBAttribute
    private String id;

    @DynamoDBAttribute
    private String name;

    @DynamoDBAttribute
    private String email;

    @DynamoDBAttribute
    private Integer age;

    @DynamoDBAttribute
    private Address address;
}

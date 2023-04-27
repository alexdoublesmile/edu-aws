package com.example.awssample.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

import java.io.Serializable;

@DynamoDBDocument
public class Address implements Serializable {
    
    @DynamoDBAttribute
    private Long code;
    @DynamoDBAttribute
    private String city;
    @DynamoDBAttribute
    private String state;
}

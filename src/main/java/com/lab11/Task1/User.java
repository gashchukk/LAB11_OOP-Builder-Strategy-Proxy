package com.lab11.Task1;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

import java.io.File;
import java.io.IOException;
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class User extends Person {
    private Gender gender;
    private double weight;
    private double height;
    @Singular 
    private List<String> hobbies;

}
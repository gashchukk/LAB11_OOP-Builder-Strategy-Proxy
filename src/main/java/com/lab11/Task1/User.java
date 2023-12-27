package com.lab11;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

import java.io.File;
import java.io.IOException;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class User extends Person {
    private Gender gender;
    private double weight;
    private double height;
    @Singular private List<String> hobbies;

    public static void main(String[] args) {
        User user = User.builder()
                .name("John")
                .age(25)
                .gender(Gender.MALE)
                .weight(70.5)
                .height(175.0)
                .hobby("Reading")
                .hobby("Sports")
                .build();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

       
            try {
                objectMapper.writeValue(new File("user.json"), user);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
       

        Person person = Person.builder()
                .name("Jane")
                .age(30)
                .build();

    //Воно чомусь захотіло  try/catch
            try {
                objectMapper.writeValue(new File("person.json"), person);
            } catch (StreamWriteException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (DatabindException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }        
    }
}
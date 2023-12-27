package com.lab11.task2;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Client {
    private String name;
    private int age;
    private Gender sex;
    private String email;
    private  static int id = 0;
    public Client(String name, Gender sex, int age, String email){
        id++;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.email = email;
    }
}
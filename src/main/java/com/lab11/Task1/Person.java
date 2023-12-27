package com.lab11.Task1;
import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private int age;
}

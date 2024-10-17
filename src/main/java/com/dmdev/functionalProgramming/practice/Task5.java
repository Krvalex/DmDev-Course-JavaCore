package com.dmdev.functionalProgramming.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {

    public static void main(String[] args) {

        List<Person> persons = List.of(
                new Person("Alexandr", "Smirnov", 20),
                new Person("Ivan", "Smirnov", 20),
                new Person("Petr", "Smirnov", 20),
                new Person("Vasiliy", "Smirnov", 20),
                new Person("Dmitry", "Smirnov", 20),
                new Person("Kristina", "Smirnov", 20),
                new Person("Vitalina", "Smirnov", 20),
                new Person("Anastasia", "Smirnov", 20),
                new Person("Maksim", "Smirnov", 90)
        );

        persons.stream().
                filter(fN -> fN.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<String>> map = persons.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getFullName, Collectors.toList())));
        System.out.println(map);

        Map<Integer, Person> map2 = persons.stream()
                .collect(Collectors.toMap(Person::getAge, person -> person));
        //  System.out.println(map2);
    }
}

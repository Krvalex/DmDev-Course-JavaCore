package com.dmdev.collesctions.map;

import com.dmdev.collesctions.person.Person;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Svetikova");

        Map<Integer, Person> map = new LinkedHashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sveta.getId(), sveta);


        for (Map.Entry<Integer, Person> person : map.entrySet()) {
            System.out.println(person.getKey() + "   " + person.getValue());
        }


    }
}

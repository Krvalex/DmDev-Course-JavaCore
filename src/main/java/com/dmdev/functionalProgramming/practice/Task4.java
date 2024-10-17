package com.dmdev.functionalProgramming.practice;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        String string = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(string);
    }
}

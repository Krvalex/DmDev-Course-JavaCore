package com.dmdev.functionalProgramming.practice;

import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 5, 2, 3, 4, 15, 20);

        list.stream()
                .filter(i -> i % 2 != 0 && i % 5 == 0)
                .mapToInt(Integer::valueOf)
                .average()
                .ifPresent(System.out::println);
    }
}

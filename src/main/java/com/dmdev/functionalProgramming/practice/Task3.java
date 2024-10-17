package com.dmdev.functionalProgramming.practice;

import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of(
                "1234567", 1,
                "12345678", 2,
                "123456", 3,
                "12345", 4,
                "123", 5,
                "123456789", 6,
                "12345678910", 7,
                "1", 8
        );

        int sum = map.entrySet().stream()
                .filter(k -> k.getKey().length() < 7)
                .mapToInt(k -> k.getValue().intValue())
                .sum();
        System.out.println(sum);

    }
}

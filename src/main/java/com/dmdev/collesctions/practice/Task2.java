package com.dmdev.collesctions.practice;

import java.util.HashSet;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) {
        Map<String, String> map = Map.of(
                "a", "b",
                "b", "c");
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        return new HashSet<>(map.values()).size() == map.size();
    }
}

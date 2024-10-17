package com.dmdev.collesctions.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<Integer> array = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
//        System.out.println(removeEven(array));
        System.out.println(countUnique2(array));
    }

    public static List<Integer> removeEven(List<Integer> array) {
        List<Integer> newArray = new ArrayList<>();
        for (Integer i : array) {
            if (i % 2 != 0) {
                newArray.add(i);
            }
        }
        return newArray;
    }

    public static int countUnique(List<Integer> array) {
        List<Integer> newArray = new ArrayList<>();
        if (array == null || array.size() == 0) {
            return 0;
        } else {
            for (Integer i : array) {
                if (!newArray.contains(i))
                    newArray.add(i);
            }
        }
        return newArray.size();
    }

    public static int countUnique2(List<Integer> array) {
        return new HashSet<>(array).size();
    }
}

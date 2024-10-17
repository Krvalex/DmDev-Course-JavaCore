package com.dmdev.collesctions.iterator;

import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//        }
//
        for (Integer i : list) {
            System.out.println(i);
        }

    }
}

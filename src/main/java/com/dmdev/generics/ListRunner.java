package com.dmdev.generics;

import com.dmdev.oop.practice2.Archer;

public class ListRunner {

    public static void main(String[] args) {

        List<Object> list = new List<>(10);
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");
        list.add(1);
        list.add(2);
        list.add(new Archer<>("asd", 2));

        for (Object o : list) {
            System.out.println(o.toString());
        }
    }
}

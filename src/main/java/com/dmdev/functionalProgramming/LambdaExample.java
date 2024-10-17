package com.dmdev.functionalProgramming;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {
        //Comparator<Integer> integerComporator = (o1, o2) -> Integer.compare(o1, o2);
        Comparator<Integer> integerComporator = Integer::compare;
        System.out.println(integerComporator.compare(25, 100));
    }
}

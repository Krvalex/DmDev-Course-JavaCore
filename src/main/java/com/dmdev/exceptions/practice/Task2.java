package com.dmdev.exceptions.practice;

public class Task2 {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Catch");
            e.printStackTrace();
        }
        System.err.println("end");
    }
}

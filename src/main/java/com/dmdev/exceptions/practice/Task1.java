package com.dmdev.exceptions.practice;

public class Task1 {

    public static void main(String[] args) {
        String value = null;
        try {
            value.length();
        } catch (NullPointerException e) {
            System.err.println("Catch");
            e.printStackTrace();
        }
    }
}

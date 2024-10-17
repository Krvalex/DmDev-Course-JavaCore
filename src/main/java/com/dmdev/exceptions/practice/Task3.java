package com.dmdev.exceptions.practice;

public class Task3 {

    public static void main(String[] args) {
        try {
            unsafe();
        } catch (Task3exception e) {
            System.err.println("Catch");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws Task3exception {
        throw new Task3exception("Соси хуй");
    }
}

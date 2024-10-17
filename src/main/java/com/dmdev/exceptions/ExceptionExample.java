package com.dmdev.exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("main start");
        try {
            System.out.println(finallyTest());
            unsafe(10);
        } catch (RuntimeException exception) {
            System.out.println("catch");
            exception.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        System.out.println("main end");
    }

    public static int finallyTest() {
        try {
            return 2;
        } catch (Throwable throwable) {
            return 3;
        } finally {
            return 4;
        }
    }

    public static void unsafe(int value) {
        System.out.println("unsafe start");
        if (value > 0) {
            throw new RuntimeException();
        }
        System.out.println("unsafe end");
    }
}

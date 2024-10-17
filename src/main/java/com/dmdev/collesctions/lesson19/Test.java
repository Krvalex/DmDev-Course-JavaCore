package com.dmdev.collesctions.lesson19;

public class Test {

    public static void main(String[] args) {
        A a = new A(1, "asd");
        A b = new A(1, "asd");
        System.out.println(a.equals(b));
    }

    private static class A {
        int a;
        String b;

        public A(int a, String b) {
            this.a = a;
            this.b = b;
        }
    }
}

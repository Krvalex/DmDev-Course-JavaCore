package com.dmdev.oop.practice1;

public class PracticeRunner {
    public static void main(String[] args) {
        Time time = new Time(1, 2, 30);
        System.out.println(time.getSeconds());

        Time time1 = new Time(time.getSeconds());
        time1.printTime();

        Time time3 = time.sum(time1);
        time3.printTime();
    }
}

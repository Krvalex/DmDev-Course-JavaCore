package com.dmdev.dateAndTime.practice;

import java.time.LocalDateTime;

public class Task1 {

    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.of(2020, 6, 25, 19, 47);
        LocalDateTime newTime = time.plusMonths(3);

        System.out.println(newTime.toLocalDate());
        System.out.println(newTime.toLocalTime());
    }
}

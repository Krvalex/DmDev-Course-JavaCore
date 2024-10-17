package com.dmdev.dateAndTime.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task2 {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String format = now.format(dateTimeFormatter);
        System.out.println(format);
    }
}

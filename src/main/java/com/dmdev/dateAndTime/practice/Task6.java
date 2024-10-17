package com.dmdev.dateAndTime.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Task6 {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

//        LocalDateTime localDateTime = LocalDateTime.of(localDate, LocalTime.MIDNIGHT);
        LocalDateTime nowDateTime = localDate.atStartOfDay();
        LocalDateTime prevDateTime = prevDate.atStartOfDay();

        long between = ChronoUnit.SECONDS.between(prevDateTime, nowDateTime);
        System.out.println(between);

        Duration between1 = Duration.between(prevDateTime, nowDateTime);
        System.out.println(between1.getSeconds());
    }
}

package com.dmdev.dateAndTime.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Task5 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

        Period period = Period.between(prevDate, localDate);
        System.out.println(period.getDays());

        long between = ChronoUnit.DAYS.between(prevDate, localDate);
        System.out.println(between);
    }
}

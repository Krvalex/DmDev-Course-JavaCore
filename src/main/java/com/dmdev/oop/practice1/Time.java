package com.dmdev.oop.practice1;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Time(int totalseconds) {
        this.hours = totalseconds / 3600;
        this.minutes = totalseconds % 3600 / 60;
        this.seconds = totalseconds % 3600 % 60;
    }

    void printTime() {
        System.out.printf("%02d %02d %02d\n", hours, minutes, seconds);
    }

    Time sum(Time time) {
        return new Time(this.getSeconds() + time.getSeconds());
    }

    int getSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.seconds;
    }
}

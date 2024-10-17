package com.dmdev.regularExpressions.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {
        String regex = "0[xX][0-9a-fA-F]+";
        String number = "sdsdsa d 0xF sd ds ds 0x12 sads 0xFF";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

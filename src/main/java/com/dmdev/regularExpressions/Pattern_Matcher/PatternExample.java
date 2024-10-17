package com.dmdev.regularExpressions.Pattern_Matcher;

import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        String phoneNumber = "+7(927)111-22-33";
        String regex = "\\+7 ?\\(\\d{3}\\) ?\\d{3}-\\d{2}-\\d{2}";

//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(phoneNumber);
//        System.out.println(matcher.matches());

        System.out.println(Pattern.matches(regex, phoneNumber));
        System.out.println(phoneNumber.matches(regex));
    }
}

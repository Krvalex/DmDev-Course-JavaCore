package com.dmdev.regularExpressions.Pattern_Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {

    public static void main(String[] args) {
        String phoneNumber = "asdas das dasd +7 (937) 111-22-33 dsas dasd +7 (917) 678-44-99" +
                "sdasd+7 (927) 555-52-52 asdasd +7 (909) 321-22-21";
        String regex = "\\+7 ?\\((?<code>\\d{3})\\) ?\\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group("code"));
        }

    }
}

package com.dmdev.regularExpressions.practice;

public class Task3 {

    public static void main(String[] args) {
        String regex = "(<p .+?>)(.+?</p>)";
        String input = "<p> sds dasdasd </p> sdasd  <b> sdsad </b> sadasd sdasd <p id=\"p1\"> sdasd</p>" +
                "sadasdas <p>asdasd";
        System.out.println(input.replaceAll(regex, "<p>$2"));
    }
}

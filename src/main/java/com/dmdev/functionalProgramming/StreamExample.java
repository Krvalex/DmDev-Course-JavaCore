package com.dmdev.functionalProgramming;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        IntSummaryStatistics intstat = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(string -> string % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(intstat);

        List<String> collect = Stream.of("88", "11", "22", "33", "44", "55", "66")
                .peek(System.out::println)
                .collect(Collectors.toList());

        IntStream.range(0, 10)
                .forEach(System.out::println);

        IntStream.iterate(0, i -> i + 1)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);


//        for (String string : strings) {
//            String value = string + string;
//            Integer integer = Integer.valueOf(value);
//            if(integer % 2 == 0) {
//                System.out.println(integer);
//            }
//        }
    }
}

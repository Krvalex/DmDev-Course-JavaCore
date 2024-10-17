package com.dmdev.functionalProgramming;

import java.util.Optional;
import java.util.stream.Stream;

public class MapReduceExample {

    public static void main(String[] args) {

        Optional<Student> maybeStudent = Stream.of(
                        new Student(18, "Ivan"),
                        new Student(12, "Petr"),
                        new Student(32, "Alex"),
                        new Student(44, "Dima"),
                        new Student(46, "Kirill"),
                        new Student(34, "Artem"),
                        new Student(77, "Sergey"),
                        new Student(33, "Rinat")
                )
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);

        maybeStudent.ifPresent(System.out::println);

        maybeStudent
                .map(Student::getAge)
                .flatMap(age -> Optional.of(age * 2))
                .ifPresent(System.out::println);


//                .parallel()
//                .sequential()
//                .map(Student::getAge)
//                .reduce(Math::max)
//                .ifPresent(System.out::println);
    }
}

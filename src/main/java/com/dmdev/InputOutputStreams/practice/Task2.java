package com.dmdev.InputOutputStreams.practice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            String prev = "1";
            while (scanner.hasNext()) {
                String next = scanner.next();
                if (ifEqualLastSymbolAndFirstSymbol(prev, next)) {
                    System.out.println(prev + " " + next);
                }
                prev = next;
            }
        }
    }

    public static boolean ifEqualLastSymbolAndFirstSymbol(String prev, String next) {
        return prev.charAt(prev.length() - 1) == next.charAt(0);
    }
}

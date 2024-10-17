package com.dmdev.InputOutputStreams.practice;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task1 {

    private static final String SYMBOLS = "eyuioaj";

    public static void main(String[] args) throws IOException {

        Path path = Path.of("resources", "test.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String word = scanner.next();
                char symbol = word.charAt(0);
                if (SYMBOLS.indexOf(symbol) != -1) {
                    System.out.println(word);
                }
            }
        }
    }
}

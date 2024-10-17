package com.dmdev.InputOutputStreams.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task4 {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("src", "main", "java", "com", "dmdev", "InOut", "practice", "Task3.java");
        String pathString = Files.readString(path);
        String newString = pathString.replace("public", "private");

        Path newPath = Path.of("resources", "Task3.java");
        Files.writeString(newPath, newString);

    }
}

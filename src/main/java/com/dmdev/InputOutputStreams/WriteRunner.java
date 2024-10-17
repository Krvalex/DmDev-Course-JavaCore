package com.dmdev.InputOutputStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteRunner {

    public static void main(String[] args) throws IOException {

        //File file = Path.of("resources", "writer.txt").toFile();
        //try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {
        //    fileWriter.append("Hello World!");
        //    fileWriter.newLine();
        //    fileWriter.append("Java");
        //}

//        Path path = Path.of("resources", "writer.txt");
//        try (BufferedWriter fileWriter = Files.newBufferedWriter(path)) {
//            fileWriter.append("Hello World!");
//            fileWriter.newLine();
//            fileWriter.append("Java");
//            fileWriter.append("!!");
//        }

        Path path = Path.of("resources", "writer2.txt");
        Files.write(path, List.of("Hello world!", "Java"));

    }
}

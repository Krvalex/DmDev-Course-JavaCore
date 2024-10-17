package com.dmdev.InputOutputStreams;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class OutPutRunner {

    public static void main(String[] args) throws IOException {

        File file = Path.of("resources", "output.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String s = "Hello World";
            outputStream.write(s.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}

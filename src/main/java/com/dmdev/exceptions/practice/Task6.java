package com.dmdev.exceptions.practice;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

public class Task6 {

    public static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            1, new RuntimeException("runtime"),
            2, new FileNotFoundException("file not found"),
            3, new IndexOutOfBoundsException("index out of bounds"));

    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        } catch (FileNotFoundException e) {
            System.out.println("1");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("2");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("3");
            e.printStackTrace();
        } catch (Throwable e) {
            System.out.println("4");
            e.printStackTrace();
        }
    }

    public static void unsafe(int randomValue) throws Throwable {
        Throwable exception = EXCEPTIONS.getOrDefault(randomValue, new Task3exception("task3exception"));
        throw exception;
    }
}

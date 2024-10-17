package com.dmdev.java.util.concurrent.practice;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Task2 {

    public static void main(String[] args) {
        int[] values = new int[100_000_000];
        Random rand = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(300) + 1;
        }

        ExecutorService executor = Executors.newFixedThreadPool(10);
        trackTime(() -> {
            try {
                return findMaxParallel(values, executor);
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
            return Integer.MIN_VALUE;
        });
        trackTime(() -> findMax(values));
    }

    public static int trackTime(Supplier<Integer> task) {
        long stratTime = System.currentTimeMillis();
        int result = task.get();
        System.out.println(result + " " + (System.currentTimeMillis() - stratTime));
        return result;
    }

    public static int findMax(int[] values) {
        return IntStream.of(values)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public static int findMaxParallel(int[] values, ExecutorService executor) throws ExecutionException, InterruptedException {
        return executor.submit(() -> IntStream.of(values)
                .parallel()
                .max()
                .orElse(Integer.MIN_VALUE)).get();
    }
}

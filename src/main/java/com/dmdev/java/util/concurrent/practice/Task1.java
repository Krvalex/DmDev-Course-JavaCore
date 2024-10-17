package com.dmdev.java.util.concurrent.practice;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService threadExecutor = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int seconds = scanner.nextInt();
            if (seconds < 0) {
                break;
            }
            threadExecutor.submit(() -> {
                Integer count = threadLocal.get();
                threadLocal.set(count == null ? 1 : count + 1);
                System.out.println(String.format("Поток %s, задач %d: ", Thread.currentThread().getName(), count));

                Thread.sleep(seconds * 1000);
                System.out.println(String.format("Поток %s спал %d seconds", Thread.currentThread().getName(), seconds));
                return seconds;
            });
        }

        threadExecutor.shutdown();
        threadExecutor.awaitTermination(10, TimeUnit.MINUTES);

    }
}

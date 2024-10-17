package com.dmdev.java.util.concurrent.pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        Executors.newSingleThreadExecutor();
//        Executors.newCachedThreadPool();
//        Executors.newScheduledThreadPool(3);
//        Executors.newWorkStealingPool();

//        test();

        ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(4);
        threadPool.scheduleAtFixedRate(() -> System.out.println("OK!"), 2, 4, TimeUnit.SECONDS);

//        threadPool.shutdown();
//        threadPool.awaitTermination(1, TimeUnit.HOURS);


    }

    private static void test() throws InterruptedException, ExecutionException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        Future<Integer> future = threadPool.submit(() -> {
            Thread.sleep(2000);
            System.out.println("It's callable");
            return 1;
        });

        System.out.println("Result: " + future.get());
        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
        System.out.println("main end");
    }
}

package com.dmdev.multithread;

public class ThreadDemo {

    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        System.out.println(simpleThread.getName() + " " + simpleThread.getState());
        var runnableThread = new Thread(new SimpleRunnable(), "runnableThread");
        var lambdaThread = new Thread(() -> System.out.println("Hello from runnable: " + Thread.currentThread().getName()));


        simpleThread.start();
        System.out.println(simpleThread.getName() + " " + simpleThread.getState());
        runnableThread.start();
        lambdaThread.start();
        try {
            simpleThread.join(100);
            System.out.println(simpleThread.getName() + " " + simpleThread.getState());
            runnableThread.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}

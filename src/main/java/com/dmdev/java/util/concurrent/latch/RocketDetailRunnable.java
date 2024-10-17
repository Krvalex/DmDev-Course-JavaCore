package com.dmdev.java.util.concurrent.latch;

import java.util.concurrent.CountDownLatch;

public class RocketDetailRunnable implements Runnable {

    private final RocketDetail rocketDetail;
    private final CountDownLatch countDownLatch;

    public RocketDetailRunnable(RocketDetail rocketDetail, CountDownLatch countDownLatch) {
        this.rocketDetail = rocketDetail;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Готовится деталь: " + rocketDetail);
        try {
            Thread.sleep(1000);
            countDownLatch.countDown();
            System.out.println("Деталь готова " + rocketDetail);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

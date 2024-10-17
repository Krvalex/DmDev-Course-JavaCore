package com.dmdev.java.util.concurrent.semaphore;

import java.util.concurrent.Semaphore;

public class BuyerThread implements Runnable {

    private final Semaphore cashboxes;

    public BuyerThread(Semaphore cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            cashboxes.acquire();

            System.out.println(Thread.currentThread().getName() + " обслуживается в какой-то кассе ");
            Thread.sleep(5);
            System.out.println(Thread.currentThread().getName() + " освобождает какую-то кассу ");

            cashboxes.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        try {
//            synchronized (cashboxes) {
//                while (true) {
//                    if (!cashboxes.isEmpty()) {
//                        Cashbox cashbox = cashboxes.remove();
//                        System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);
//
//                        cashboxes.wait(5L);
//
//                        System.out.println(Thread.currentThread().getName() + " освобождает кассу " + cashbox);
//                        cashboxes.add(cashbox);
//                        cashboxes.notifyAll();
//                        break;
//                    } else {
//                        System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу ");
//                        cashboxes.wait();
//                    }
//                }
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

    }
}

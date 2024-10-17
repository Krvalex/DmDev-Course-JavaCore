package com.dmdev.java.util.concurrent.queue;

import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<Cashbox> cashboxes;

    public BuyerThread(BlockingQueue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        Cashbox cashbox = null;
        try {
            cashbox = cashboxes.take();
            System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);
            Thread.sleep(5);
            System.out.println(Thread.currentThread().getName() + " освобождает кассу " + cashbox);
            cashboxes.add(cashbox);
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

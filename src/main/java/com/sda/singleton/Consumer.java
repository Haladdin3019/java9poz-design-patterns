package com.sda.singleton;

public class Consumer implements Runnable {
    @Override
    public void run() {
        System.out.println("Consumer Thread started at " + MyClock.getCurrentTime());
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Consumed: " + Queue.instanceOf().pop());
        }
    }
}

package com.sda.singleton;

public class Producer implements Runnable {


    @Override
    public void run() {
        System.out.println("Producer Thread started at " + MyClock.getCurrentTime());
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Queue.instanceOf().push("test");
        }

    }

}

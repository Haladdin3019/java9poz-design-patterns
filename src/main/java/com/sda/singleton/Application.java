package com.sda.singleton;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        Thread consumerThread1 = new Thread(new Consumer());
        Thread consumerThread2 = new Thread(new Consumer());
        Thread producerThread1 = new Thread(new Producer());
        Thread producerThread2 = new Thread(new Producer());

        producerThread1.start();
        Thread.sleep(100);
        producerThread2.start();
        Thread.sleep(100);
        consumerThread1.start();
        Thread.sleep(100);
        consumerThread2.start();

    }
}

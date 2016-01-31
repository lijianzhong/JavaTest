package com.lijz.lang;

/**
 * Created by jianzhongli on 16/1/31.
 */
public class ThreadTest {

    public static void main(String[] args){

        Thread thread = new Thread(new Task1());

        thread.start();

        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();
        System.out.println("thread is interrupt");
    }


    public static class Task1 implements Runnable {
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {

                System.out.println("task1 is running");
            }
        }
    }
}

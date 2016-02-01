package com.lijz.lang;

/**
 * Created by jianzhongli on 16/1/31.
 */
public class ThreadTestV2 {


    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(new Runnable() {

            public void run() {
                try {
                    while (!Thread.currentThread().isInterrupted()) {
                        Thread.sleep(5000);
                        System.out.println("Hello World!");
                    }
                } catch (InterruptedException e) {
                    System.out.println("interrupt");
                    Thread.currentThread().interrupt();
                }
            }
        });
        thread.start();
        System.out.println("press enter to quit");
        System.in.read();
        thread.interrupt();
    }
}

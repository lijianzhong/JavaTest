package com.lijz.lang;

/**
 * Created by jianzhongli on 16/1/31.
 */
public class ThreadTestV3 {

    public static void main(String[] args){

        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        task.terminate();

    }


    private static class Task implements Runnable {

        private volatile boolean running = true;

        public void terminate() {
            running = false;
        }

        @Override
        public void run() {
            while (running) {
                System.out.println("processing");
            }

        }
    }
}

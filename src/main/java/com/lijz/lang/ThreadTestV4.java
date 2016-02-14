package com.lijz.lang;

import java.util.concurrent.TimeUnit;

/**
 * Created by jianzhongli on 16/2/4.
 */
public class ThreadTestV4 {

        private static boolean stopRequested;

        public static void main(String[] args) throws InterruptedException {
            Thread backgroundThread = new Thread(new Runnable() {
                public void run() {
                    int i = 0;
                    while (!stopRequested){
                        i++;
//                        System.out.println(i);
                    }
                }
            });
            backgroundThread.start();
            TimeUnit.SECONDS.sleep(1);
            stopRequested = true;
        }
}

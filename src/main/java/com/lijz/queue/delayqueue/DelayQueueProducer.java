package com.lijz.queue.delayqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by jianzhongli on 15/12/3.
 */
public class DelayQueueProducer implements  Runnable {

    private BlockingQueue<DelayObject> blockingQueue;

    private final Random random = new Random();

    public DelayQueueProducer(BlockingQueue<DelayObject> blockingQueue){
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        while(true){

            Long delayed = new Long(random.nextInt(10000));
            DelayObject delayObject = new DelayObject("test"+delayed.toString(), delayed);
            System.out.println("produce " + delayObject.getData() + ":" + delayed);
            try {
                blockingQueue.put(delayObject);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

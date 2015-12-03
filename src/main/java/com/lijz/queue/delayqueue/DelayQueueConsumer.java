package com.lijz.queue.delayqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by jianzhongli on 15/12/3.
 */
public class DelayQueueConsumer implements Runnable {

    private BlockingQueue<DelayObject> blockingQueue;

    public DelayQueueConsumer(BlockingQueue<DelayObject> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    
    @Override
    public void run() {

        while(true){
            try {
                DelayObject delayObject = blockingQueue.take();
                System.out.println("consume " + delayObject.getData() + ":" + delayObject.getStartTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

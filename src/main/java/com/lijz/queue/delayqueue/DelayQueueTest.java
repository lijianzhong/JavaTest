package com.lijz.queue.delayqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/**
 * Created by jianzhongli on 15/12/3.
 */
public class DelayQueueTest {

    public static void main(String args[]){

        BlockingQueue<DelayObject> queue = new DelayQueue<DelayObject>();

        new Thread(new DelayQueueProducer(queue)).start();

        new Thread(new DelayQueueConsumer(queue)).start();
    }
}

package com.lijz.datastruct.queue;

/**
 * Created by jianzhongli on 15/12/17.
 */
public class QueueTest {

    public static  void main(String[] args){

        /*
        QueueByStack<Integer> queueByStack = new QueueByStack<Integer>();
        queueByStack.add(1);
        queueByStack.add(4);
        Integer data = queueByStack.poll();
        System.out.println(data);
        queueByStack.add(5);
        while(!queueByStack.isEmpty()){
            data = queueByStack.poll();
            System.out.println(data);
        }
        */

        QueueByStackV2<Integer> queueByStack = new QueueByStackV2<Integer>();
        queueByStack.add(1);
        queueByStack.add(4);
        Integer data = queueByStack.poll();
        System.out.println(data);
        queueByStack.add(5);
        while(!queueByStack.isEmpty()){
            data = queueByStack.poll();
            System.out.println(data);
        }

    }
}

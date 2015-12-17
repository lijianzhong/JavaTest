package com.lijz.datastruct.stack;

/**
 * Created by jianzhongli on 15/12/16.
 */
public class StackTest {


    public static void main(String[] args){

        /*
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        while (!stack.isEmpty()) {
            Integer data = stack.pop();
            System.out.println(data);
        }
        */

        StackByQueue<Integer> stackByQueue = new StackByQueue<Integer>();
        stackByQueue.push(1);
        stackByQueue.push(5);
        Integer data = stackByQueue.pop();
        System.out.println(data);
        stackByQueue.push(3);
        while(!stackByQueue.isEmpty()) {
            data = stackByQueue.pop();
            System.out.println(data);
        }

    }
}

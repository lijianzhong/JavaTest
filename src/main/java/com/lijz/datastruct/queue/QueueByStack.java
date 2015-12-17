package com.lijz.datastruct.queue;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by jianzhongli on 15/12/17.
 * stack1负责入队列, stack2负责出队列
 */
public class QueueByStack<E> {

    private Stack<E> stack1 = new Stack<E>();
    private Stack<E> stack2 = new Stack<E>();

    public E poll(){
        if(stack1.isEmpty()){
            throw new EmptyStackException();
        }
        E data = stack1.pop();
        while(stack1.size() > 0){
            E next = stack1.pop();
            stack2.add(data);
            data = next;
        }
        //重新压入stack1
        while(stack2.size() > 0){
            stack1.add(stack2.pop());
        }
        return data;
    }

    public void add(E e){
        stack1.add(e);
    }

    public boolean isEmpty(){
        return stack1.isEmpty();
    }

}

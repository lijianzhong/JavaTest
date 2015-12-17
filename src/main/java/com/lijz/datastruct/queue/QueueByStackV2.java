package com.lijz.datastruct.queue;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by jianzhongli on 15/12/17.
 */
public class QueueByStackV2<E> {

    private Stack<E> stack1 = new Stack<E>();
    private Stack<E> stack2 = new Stack<E>();

    //如果stack2不为空,栈顶元素则是最早入队列的,直接返回即可.否则需要先将stack1中的除栈底元素压入stack2, 然后返回栈底元素
    public E poll(){
        if(stack2.size() > 0){
            return stack2.pop();
        }
        if(stack1.isEmpty()){
            throw new EmptyStackException();
        }
        E data = stack1.pop();
        while(stack1.size() > 0){
            E next = stack1.pop();
            stack2.add(data);
            data = next;
        }
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

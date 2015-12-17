package com.lijz.datastruct.stack;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jianzhongli on 15/12/16.
 * queue1负责入栈,queue2负责出栈,入栈时直接压入queue1
 * 出栈时,先将,queue1中所有元素压入queue2, 将queue1中栈顶元素弹出即可,再将queue2中元素重新压入queue1
 * 入栈O(1), 出栈时需要遍历两遍元素
 */
public class StackByQueue<E> {

    private Queue<E> queue1 = new LinkedList<E>();
    private Queue<E> queue2 = new LinkedList<E>();

    public void push(E e){
        queue1.add(e);
    }

    public E pop(){
        if(queue1.isEmpty()){
            throw new EmptyStackException();
        }
        E data  = queue1.poll();
        while(queue1.size() > 0){
            E next = queue1.poll();
            queue2.add(data);
            data = next;
        }
        while(queue2.size() > 0){
            E e = queue2.poll();
            queue1.add(e);
        }
        return data;
    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }


}

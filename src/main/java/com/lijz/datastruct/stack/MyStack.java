package com.lijz.datastruct.stack;

import java.util.EmptyStackException;
import java.util.Vector;

/**
 * Created by jianzhongli on 15/12/16.
 */
public class MyStack<E> extends Vector<E> {

    public E pop() throws EmptyStackException{
        if(this.size() == 0){
            throw new EmptyStackException();
        }
        E e= this.get(this.size()-1);
        this.removeElementAt(this.size()-1);
        return e;
    }

    public void push(E e){
        this.add(e);
    }

}

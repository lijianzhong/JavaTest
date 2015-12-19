package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 15/12/18.
 */
public class Node<E> {

    private E value;

    Node<E> next;

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}

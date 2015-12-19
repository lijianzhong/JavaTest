package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 15/12/19.
 */
public class StackByLinkList<E> {

    private MyLinkList<E> myLinkList;

    public StackByLinkList(){

        myLinkList = new MyLinkList<E>();

    }

    public Node<E> pop(){

        Node head = myLinkList.getHead();
        if(head == null){
            return null;
        }
        Node node = head.getNext();
        if(node == null){
            return null;
        }
        head.setNext(node.getNext());
        return node;
    }

    public void push(Node<E> node){

        myLinkList.insertFirst(node);
    }
}

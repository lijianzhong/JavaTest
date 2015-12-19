package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 15/12/19.
 */
public class QueueByLinkList<E> {

    private MyLinkList<E> myLinkList;
    private Node<E> head;

    public QueueByLinkList(){

        myLinkList = new MyLinkList<E>();
        head = myLinkList.getHead();
    }

    public Node<E> pull(){

        Node<E> node = head.getNext();
        if(node == null){
            return null;
        }
        head.setNext(node.getNext());
        return node;
    }


    public void add(Node<E> node){

        myLinkList.insertLast(node);

    }
}

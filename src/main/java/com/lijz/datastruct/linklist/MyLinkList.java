package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 15/12/18.
 */
public class MyLinkList<E>{

    private Node<E> head;

    public MyLinkList(){
        head = new Node<E>();
        head.setNext(null);
        head.setValue(null);
    }

    public void insertFirst(Node<E> node){
        if(node == null){
            return;
        }
        node.setNext(head.getNext());
        head.setNext(node);
    }

    public void insertLast(Node<E> node){

        Node<E> current = head;
        while(current != null && current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(node);
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> reverse(){

        if(head == null || head.getNext() == null){
            return head;
        }

        Node<E> pre = head.getNext();
        Node<E> current = pre.getNext();
        Node<E> next;

        pre.setNext(null);
        while(current != null){
            next = current.getNext();
            current.setNext(pre);
            pre = current;
            current = next;
        }
        head.setNext(pre);
        return pre;
    }
}

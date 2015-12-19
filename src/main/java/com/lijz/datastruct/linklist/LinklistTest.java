package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 15/12/19.
 */
public class LinklistTest {

    public static void main(String[] args){

        MyLinkList<Integer> mylist = new MyLinkList<Integer>();

        Node<Integer> node1 = new Node<Integer>();
        node1.setNext(null);
        node1.setValue(4);
        //mylist.insertFirst(node1);
        mylist.insertLast(node1);
        Node<Integer> node2 = new Node<Integer>();
        node2.setNext(null);
        node2.setValue(7);
        //mylist.insertFirst(node2);
        mylist.insertLast(node2);
        Node<Integer> node3 = new Node<Integer>();
        node3.setNext(null);
        node3.setValue(3);
        //mylist.insertFirst(node3);
        mylist.insertLast(node3);

        Node<Integer> node = mylist.getHead();
        while(node != null){
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}

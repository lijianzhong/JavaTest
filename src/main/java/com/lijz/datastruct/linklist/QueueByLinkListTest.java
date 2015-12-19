package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 15/12/19.
 */
public class QueueByLinkListTest {

    public static void main(String[] args){

        QueueByLinkList queueByLinkList = new QueueByLinkList();

        Node node1 = new Node();
        node1.setNext(null);
        node1.setValue(10);
        queueByLinkList.add(node1);


        Node node2 = new Node();
        node2.setNext(null);
        node2.setValue(4);
        queueByLinkList.add(node2);

        Node data = queueByLinkList.pull();
        System.out.println(data.getValue());

        Node node3 = new Node();
        node3.setNext(null);
        node3.setValue(7);
        queueByLinkList.add(node3);

        data = queueByLinkList.pull();
        while(data != null){
            System.out.println(data.getValue());
            data = queueByLinkList.pull();
        }

    }
}

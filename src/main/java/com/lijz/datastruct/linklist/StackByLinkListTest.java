package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 15/12/19.
 */
public class StackByLinkListTest {

    public static void main(String[] args){

        StackByLinkList stackByLinkList = new StackByLinkList();
        Node node1 = new Node();
        node1.setNext(null);
        node1.setValue(10);
        stackByLinkList.push(node1);


        Node node2 = new Node();
        node2.setNext(null);
        node2.setValue(4);
        stackByLinkList.push(node2);

        Node data = stackByLinkList.pop();
        System.out.println(data.getValue());

        Node node3 = new Node();
        node3.setNext(null);
        node3.setValue(7);
        stackByLinkList.push(node3);

        data = stackByLinkList.pop();
        while(data != null){
            System.out.println(data.getValue());
            data = stackByLinkList.pop();
        }
    }
}

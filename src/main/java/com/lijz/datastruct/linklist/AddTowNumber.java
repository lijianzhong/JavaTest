package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 16/1/26.
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class AddTowNumber {

    public static void main(String[] args){

        ListNode head1 = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(3);
        head1.setNext(node1);
        node1.setNext(node2);

        ListNode head2 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(4);
        head2.setNext(node3);
        node3.setNext(node4);

        AddTowNumber addTowNumber = new AddTowNumber();
        ListNode newHead = addTowNumber.add(head1, head2);
        ListNode p = newHead;
        while( p!= null){
            System.out.println(p.getValue());
            p = p.getNext();
        }

    }

    public ListNode add(ListNode head1, ListNode head2){
        if(head1 == null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

        ListNode p1 = head1;
        ListNode p2 = head2;

        int carry = 0;

        ListNode newHead  = new ListNode(0);
        ListNode p = newHead;
        while(p1 != null && p2 != null){
            int sum = p1.getValue() + p2.getValue() + carry;
            int value = (sum)%10;
            carry = (sum)/10;

            ListNode newNode = new ListNode(value);
            p.setNext(newNode);

            p1 = p1.getNext();
            p2 = p2.getNext();

            p = p.getNext();
        }

        if(p1 != null){
            ListNode newNode = new ListNode(p1.getValue() + carry);
            newNode.setNext(p1.getNext());
            p.setNext(newNode);
        }

        if(p2 != null){
            ListNode newNode = new ListNode(p2.getValue() + carry);
            newNode.setNext(p2.getNext());
            p.setNext(newNode);
        }

        return newHead.getNext();
    }

}

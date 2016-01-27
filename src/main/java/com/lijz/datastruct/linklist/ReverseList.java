package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 16/1/27.
 */
public class ReverseList {

    public static void main(String[] args){

        ReverseList reverseList = new ReverseList();
        ListNode node1 = new ListNode(1);

        ListNode node2 = new ListNode(2);
        node1.setNext(node2);

        ListNode node3 = new ListNode(3);
        node2.setNext(node3);

        ListNode node4 = new ListNode(4);
        node3.setNext(node4);

        ListNode newHead = reverseList.reverse(node1);
        ListNode p = newHead;
        while(p != null){
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }


    private static class ListNode{

        private int value;

        private ListNode next;

        public ListNode(int value){

            this.value = value;
            next = null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.getNext() == null){
            return head;
        }

        ListNode pre = head;
        ListNode current = head.getNext();
        while(current != null){
            ListNode temp = current.getNext();
            current.setNext(pre);
            pre = current;
            current = temp;
        }
        head.setNext(null);
        return pre;
    }
}

package com.lijz.datastruct.linklist;

/**
 * Created by jianzhongli on 16/1/27.
 */
public class LinkListCycle {

    public static void main(String[] args){
        LinkListCycle linkListCycle = new LinkListCycle();
        ListNode head = new ListNode(1);
        //head.setNext(head);
        ListNode node1 = new ListNode(2);
        head.setNext(node1);
        ListNode node2 = new ListNode(3);
        node1.setNext(node2);
        ListNode node3 = new ListNode(4);
        node2.setNext(node3);
        //node3.setNext(head);

        System.out.println(linkListCycle.hasCycle(head));
    }

    public boolean hasCycle(ListNode head){
        if(head == null || head.getNext() == null){
            return false;
        }

        ListNode slow = head;
        ListNode faster = head;
        while(faster != null && faster.getNext() != null){
            slow = slow.getNext();
            faster = faster.getNext().getNext();
            if(slow == faster){
                return true;
            }
        }

        return false;
    }
}

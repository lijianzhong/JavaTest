package com.lijz.datastruct.linklist;

import java.util.*;

/**
 * Created by jianzhongli on 16/1/27.
 */
public class MergeKSortedList {

    public static void main(String[] args){

        MergeKSortedList mergeKSortedList = new MergeKSortedList();

        ListNode head1 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        head1.setNext(node1);

        ListNode head2 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        head2.setNext(node2);

        ListNode head3 = new ListNode(5);
        ListNode node3 = new ListNode(6);
        head3.setNext(node3);

        List<ListNode> list = Arrays.asList(head1, head2, head3);

        ListNode head = mergeKSortedList.merge(list);
        ListNode p = head;
        while(p != null){
            System.out.println(p.getValue());
            p = p.getNext();
        }
    }

    public ListNode merge(Collection<ListNode> nodes){

        if(nodes.isEmpty()){
            return null;
        }

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(nodes.size(), new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.getValue() - o2.getValue();
            }
        });

        for(ListNode node : nodes){
            if(node != null) {
                queue.add(node);
            }
        }

        ListNode head = new ListNode(0);
        ListNode p = head;

        while(!queue.isEmpty()){
            ListNode newNode = queue.poll();
            if(newNode.getNext() != null){
                queue.add(newNode.getNext());
            }
            p.setNext(newNode);
            p = p.getNext();
        }

        return head.getNext();
    }
}

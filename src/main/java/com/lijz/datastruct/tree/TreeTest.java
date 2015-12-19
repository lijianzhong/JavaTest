package com.lijz.datastruct.tree;

import java.util.List;

/**
 * Created by jianzhongli on 15/12/19.
 */
public class TreeTest {

    public static  void main(String[] args){

        Node<Integer> root = new Node<Integer>();
        root.setValue(10);
        Tree<Integer> tree = new Tree<Integer>(root);

        Node<Integer> left1 = new Node<Integer>();
        left1.setValue(20);

        Node<Integer> right1 = new Node<Integer>();
        right1.setValue(25);

        tree.addLeftChild(root, left1);
        tree.addRightChild(root, right1);

        Node<Integer> left2 = new Node<Integer>();
        left2.setValue(30);

        Node<Integer> right2 = new Node<Integer>();
        right2.setValue(35);

        tree.addLeftChild(left1, left2);
        tree.addRightChild(left1, right2);

        Node<Integer> left3 = new Node<Integer>();
        left3.setValue(40);

        Node<Integer> right3 = new Node<Integer>();
        right3.setValue(45);

        tree.addLeftChild(right1, left3);
        tree.addRightChild(right1, right3);

        //List<Node<Integer>> nodes = tree.recursionTravel(root);

        List<Node<Integer>> nodes = tree.unRecursionTravel(root);

        for(Node<Integer> node : nodes){

            System.out.println(node.getValue());
        }




    }
}

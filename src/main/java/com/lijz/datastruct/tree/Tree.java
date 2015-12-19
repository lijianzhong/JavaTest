package com.lijz.datastruct.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by jianzhongli on 15/12/19.
 */
public class Tree<E> {

    private Node<E> root;

    public Tree(Node<E> root){
        this.root = root;
    }

    public Node<E> getRoot() {
        return root;
    }

    public void addLeftChild(Node<E> parent, Node<E> child){
        if(parent == null){
            return;
        }

        parent.setLeft(child);
    }

    public void addRightChild(Node<E> parent, Node<E> child){

        if(parent == null){
            return;
        }

        parent.setRight(child);
    }

    public List<Node<E>> recursionTravel(Node<E> node){

        if(node == null){
            return null;
        }
        List<Node<E>> nodes = new ArrayList<Node<E>>();
        nodes.add(node);

        List<Node<E>> leftNodes = recursionTravel(node.getLeft());
        if(leftNodes != null && (!leftNodes.isEmpty())){

            nodes.addAll(leftNodes);
        }

        List<Node<E>> rightNodes = recursionTravel(node.getRight());
        if(rightNodes != null && (!rightNodes.isEmpty())){

            nodes.addAll(rightNodes);
        }

        return nodes;

    }

    public List<Node<E>> unRecursionTravel(Node<E> node){
        List<Node<E>> nodes = new ArrayList<Node<E>>();
        Stack<Node<E>> stack = new Stack<Node<E>>();
        if(node != null){
            stack.add(node);
        }
        while(!stack.isEmpty()){
            Node<E> currentNode = stack.pop();
            if(currentNode != null) {
                nodes.add(currentNode);
                stack.push(currentNode.getLeft());
                stack.push(currentNode.getRight());
            }
        }
        return nodes;
    }
}

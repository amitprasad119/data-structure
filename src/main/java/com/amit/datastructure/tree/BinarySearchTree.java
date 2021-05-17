package com.amit.datastructure.tree;

public class BinarySearchTree {

    Node<Integer> insertNode(Node<Integer> head, Node<Integer> newNode) {
        if(head == null) {
            return newNode;
        }

        if(newNode.getData() <= head.getData()) {
            head.setLeftChild(insertNode(head.getLeftChild(),newNode));
        } else {
            head.setRightChild(insertNode(head.getRightChild(),newNode));
        }
        return  head;
    }

    void inOrder(Node<Integer> head) {
        if(head == null)
            return;
        inOrder(head.getLeftChild());
        System.out.print(head.getData() +"->");
        inOrder(head.getRightChild());
    }
    void postOrder(Node<Integer> head) {
        if(head == null)
            return;
        postOrder(head.getLeftChild());
        postOrder(head.getRightChild());
        System.out.print(head.getData() +"->");
    }

    void preOrder(Node<Integer> head) {
        if(head == null)
            return;
        System.out.print(head.getData() +"->");
        preOrder(head.getLeftChild());
        preOrder(head.getRightChild());

    }

    int findMin(Node<Integer> head) {
        if(head == null) {
            return -1;
        }
        if(head.getLeftChild() == null)
          return  head.getData();
      return   findMin(head.getLeftChild());
    }

    int maxLevel(Node<Integer> head) {
        if(head == null) {
            return  0;
        }
        if(head.getLeftChild() == null && head.getRightChild() == null) {
            return 0;
        }
        int leftMax = 1 + maxLevel(head.getLeftChild());
        int rightMax = 1 + maxLevel(head.getRightChild());
       return Math.max(leftMax,rightMax);
    }

    void mirrorTree(Node<Integer> head) {
      if(head == null) {
          return;
      }
      Node<Integer> tempLeft = head.getLeftChild();
      head.setLeftChild(head.getRightChild());
      head.setRightChild(tempLeft);
    }

    int findMax(Node<Integer> head) {
        if(head == null) {
            return  -1;
        }
         if(head.getRightChild() == null) {
             return head.getData();
         }
       return  findMax(head.getRightChild());
    }

    long calculateTotal(Node<Integer> head) {
        if(head == null) {
            return 0;
        }
        return head.getData() + calculateTotal(head.getRightChild()) + calculateTotal(head.getLeftChild());
    }

}

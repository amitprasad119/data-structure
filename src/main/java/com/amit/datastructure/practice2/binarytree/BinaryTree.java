package com.amit.datastructure.practice2.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1);
        Node<Integer> twoNode = new Node<>(2);
        Node<Integer> threeNode = new Node<>(3);
        Node<Integer> fourNode = new Node<>(4);
        Node<Integer> fiveNode = new Node<>(5);
        Node<Integer> sixNode = new Node<>(6);
        Node<Integer> sevenNode = new Node<>(7);

        root.setLeftNode(twoNode);
        root.setRightNode(threeNode);
        twoNode.setRightNode(fiveNode);
        twoNode.setLeftNode(fourNode);
        threeNode.setLeftNode(sixNode);
        threeNode.setRightNode(sevenNode);
        System.out.println();
        System.out.println("Pre-order");
        preOrder(root);
        System.out.println();
        System.out.println("In-order");
        inOrder(root);
        System.out.println();
        System.out.println("Post-order");
        postOrder(root);
        System.out.println();
        System.out.println("BFS");
        System.out.println();
        bfs(root);
        System.out.println("Total value:"+totalCount(root));

    }

     public static  int totalCount(Node<Integer> root) {
       if(root == null) {
           return 0;
       }

       return  root.getData() + totalCount(root.getLeftNode()) + totalCount(root.getRightNode());
     }
    /**
     *  BFS
     */
    public static <T> void bfs(Node<T> root) {
        Queue<Node<T>> queue = new LinkedList();
        if(root == null) {
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
         Node node = queue.remove();
         print(node);
         if(node.getLeftNode() != null) {
             queue.add(node.getLeftNode());
         }
         if(node.getRightNode() != null) {
             queue.add(node.getRightNode());
         }
        }
    }

    /**
     *  DFS Pre-Order, In-order, Post-order
     */

    public  static void print(Node node) {
        System.out.print(node.data);
        System.out.print(" -> ");
    }

    public  static void preOrder(Node root) {
       if(root == null) {
           return;
       }
       print(root);
       preOrder(root.getLeftNode());
       preOrder(root.getRightNode());
    }

    public  static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        inOrder(root.getLeftNode());
        print(root);
        inOrder(root.getRightNode());
    }

    public static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        postOrder(root.getLeftNode());
        postOrder(root.getRightNode());
        print(root);
    }
}

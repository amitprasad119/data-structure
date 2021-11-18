package com.amit.datastructure.practice2.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    public static void main(String[] args) {

     Node<Integer> sevenNode = new Node<>(7);
     Node<Integer> oneNode = new Node<>(1);
     Node<Integer> twoNode = new Node<>(2);
     Node<Integer> threeNode = new Node<>(3);
     Node<Integer> fourNode = new Node<>(4);
     Node<Integer> fiveNode = new Node<>(5);
     Node<Integer> sixNode = new Node<>(6);
     Node<Integer> eightNode = new Node<>(8);
     Node<Integer> nineNode = new Node<>(9);

        Node<Integer> head = insert(null, fiveNode);

        insert(head, eightNode);
        insert(head, twoNode);
        insert(head, oneNode);
        insert(head, sevenNode);
        insert(head, threeNode);
        insert(head, nineNode);
        insert(head, sixNode);
        insert(head, fourNode);

//        postOrder(head);
//        System.out.println();
//        System.out.println("Data:" +  lookup(head,9).getData());
//        System.out.println("Min:"+ findMinItr(head));
//        System.out.println("Min(Rec):"+ findMin(head));
//        System.out.println("Max Depth:"+maxDepth(head));
       // mirrorTree(head);
//        postOrder(head);
//        printRange(head,2,8);
        System.out.println("Total Tree from 3 nodes:"+ countTrees(3));
        int min = findMin(head);
        int max = findMax(head);
        System.out.println("max and min "+ max + ": " + min);
        System.out.println("isBST:"+ isBinarySearchTree(head,Integer.MIN_VALUE,Integer.MAX_VALUE));
        System.out.println(maxDepth(head ,"NA"));
    }


    /**
     *  Check if tree is BST
     */

    public static boolean isBinarySearchTree(Node<Integer> head, int min, int max) {
        if(head == null) {
            return  true;
        }

        if(head.getData() <= min || head.getData() > max) {
            return false;
        }
       return isBinarySearchTree(head.getLeftNode(),min,head.getData()) && isBinarySearchTree(head.getRightNode(), head.getData(),max);
    }

    /**
     *
     * Iterative find the min
     */
    public static int findMinItr(Node<Integer> head) {
       Node<Integer> curr = head;
        if(head == null) {
            return -1;
        }
        while (curr.getLeftNode()!=null) {
            curr = curr.getLeftNode();
        }
       return curr.getData();
    }

    /**
     *
     * Find the min using recursion
     */
    public static int findMin(Node<Integer> head) {
        if(head == null) {
            return -1;
        }
        if(head.getLeftNode() == null) {
            return head.getData();
        }
       return findMin(head.getLeftNode());
    }

    /**
     * Find the max from binary tree
     */

     public static int findMax(Node<Integer> head) {
         if(head == null) {
             return -1;
         }
         if(head.getRightNode() == null) {
            return head.getData();
         }
         return findMax(head.getRightNode());
     }

    /**
     *
     * Max depth of Binary tree
     */

    public static int maxDepth(Node<Integer> head, String from) {
        System.out.println(from);
        if(head == null) {
            return 0;
        }
        if(head.getLeftNode() == null && head.getRightNode() == null) {
            return 0;
        }
        int leftMax = 1 + maxDepth(head.getLeftNode(), "left");
        int rightMax = 1 + maxDepth(head.getRightNode(),"right");
        return Math.max(leftMax,rightMax);
    }

    /**
     *
     * Find the mirror of tree
     */

    public static void mirrorTree(Node<Integer> node) {
        if(node == null) {
            return;
        }
        mirrorTree(node.getLeftNode());
        mirrorTree(node.getRightNode());
        Node<Integer> curr = node.getLeftNode();
        node.setLeftNode(node.getRightNode());
        node.setRightNode(curr);
    }

    /**
     *  Print the items in range
     */

    public static void printRange(Node<Integer> root, int low, int high) {
        if (root == null) {
            return;
        }

        if (low <= root.getData()) {
            printRange(root.getLeftNode(), low, high);
        }

        if (low <= root.getData() && root.getData() <= high) {
            System.out.println("#"+root.getData());
        }

        if (high > root.getData()) {
            printRange(root.getRightNode(), low, high);
        }
    }
    /**
     *  Count tree
     */

    public static int countTrees(int numNodes) {
        if(numNodes <=1) {
            return 1;
        }

        int sum = 0;
        for(int i = 1;i<=numNodes;i++) {
          int countLeft = countTrees(i-1);
          int countRight = countTrees(numNodes - i);
          sum = sum + (countLeft * countRight);
        }
        return sum;
    }


    /**
     *
     * Look up for the data node (search)
     */
    public static Node<Integer> lookup(Node<Integer> head, int data) {
        if(head == null) {
            return null;
        }
        if(data == head.getData()) {
            return head;
        }
       if(data <= head.getData()) {
          return lookup(head.getLeftNode(),data);
       }
       else {
           return lookup(head.getRightNode(),data);
       }
    }

    public static  Node<Integer> insert(Node<Integer> node, Node<Integer> newNode) {
        if(node == null) {
            return newNode;
        }
        if(newNode.getData() <= node.getData()) {
            node.setLeftNode(insert(node.getLeftNode(),newNode));
        }
        if(newNode.getData() > node.getData()) {
            node.setRightNode(insert(node.getRightNode(),newNode));
        }
        return node;
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

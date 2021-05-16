package com.amit.datastructure.tree;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
       Node<Character> root =    bTree.createTree();
        System.out.println("\nPre Order...");
        bTree.preOrder(root);
        System.out.println("\nIn Order...");

        bTree.inOrder(root);
        System.out.println("\nPost Order...");
        bTree.postOrder(root);
    }
}

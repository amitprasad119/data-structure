package datastructure.tree;

public class BinarySearchTreeMain {
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(10);
        Node<Integer> two = new Node<>(11);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNode(null,head);
        bst.insertNode(head,two);
        bst.insertNode(head,three);
        bst.insertNode(head,four);
        bst.insertNode(head,five);
        bst.insertNode(head,six);
        bst.insertNode(head,seven);
        bst.inOrder(head);
        bst.insertNode(head,new Node<Integer>(14));
        System.out.println("");
        System.out.println("In order Tree");
        bst.inOrder(head);
        System.out.println("");
        System.out.println("Post order Tree");
        bst.postOrder(head);
        System.out.println("");
        System.out.println("Pre Order Tree");
        bst.preOrder(head);
        System.out.println("data:"+bst.findMin(head));
        System.out.println("Max:"+bst.maxLevel(head));
        System.out.println("Mirror Tree");
        bst.mirrorTree(head);
        bst.inOrder(head);
    }
}

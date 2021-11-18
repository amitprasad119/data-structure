package com.amit.datastructure.practice2.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(40);
        ll.printList();
        ll.addListBeg(5);
        System.out.println();
        ll.printList();
        System.out.println();
        System.out.println("Total so far: "+ll.countNode());
        ll.insertAtPosition(3,33);
        System.out.println();
        ll.printList();
        ll.delete();
        System.out.println("After deletion");
        ll.printList();
        System.out.println();
        ll.deleteAtPos(3);
        System.out.println("After deletion at 3");
        ll.printList();

    }
}

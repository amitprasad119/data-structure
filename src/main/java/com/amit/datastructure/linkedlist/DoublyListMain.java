package com.amit.datastructure.linkedlist;

public class DoublyListMain {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dList = new DoublyLinkedList<Integer>();
        dList.addNode(20);
        dList.addNode(30);
        dList.addNode(40);
        dList.addNode(50);
        dList.addNode(60);
        dList.printList();
        dList.addAtEnd(10);
        dList.printList();
        dList.deleteAt(2);
        dList.printList();
        dList.deleteAt(5);
        dList.printList();
        dList.deleteElement(30);
        dList.printList();
        dList.deleteElement(60);
        dList.printList();
        dList.addNode(30);
        dList.addNode(10);
        dList.printList();
        dList.deleteElement(20);
        dList.printList();
        System.out.println("Total:"+dList.totalCount());
    }
}

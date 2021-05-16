package datastructure.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(30);
        ll.addNode(40);
        ll.printList();
        ll.addToLast(50);
        ll.printList();
        ll.addToFront(5);
        ll.printList();
        ll.addToFront(0);
        ll.printList();
        ll.addToLast(60);
        ll.printList();
        System.out.println("Total Nodes:"+ll.countNodes());
        ll.insertAtNthV1(3,-1);
        ll.printList();
        System.out.println("Total Nodes:"+ll.countNodes());
        ll.insertAtNthV1(4,4);
        ll.printList();
        ll.insertAtNthV2(5,5);
        ll.printList();

    }
}

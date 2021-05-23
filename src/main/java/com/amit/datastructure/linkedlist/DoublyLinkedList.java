package com.amit.datastructure.linkedlist;

public class DoublyLinkedList<T extends Comparable<T>> {
   DoublyNode<T> head = null;

    public DoublyNode<T> addNode(T data) {
        DoublyNode<T> node =  new DoublyNode<>(data);
       if(head == null) {
           head = node;
           return  head;
       }
       node.setPrev(null);
       node.setNext(head);
       head.setPrev(node);
       head = node;
       return head;
    }

    public void addAtEnd(T data) {
        DoublyNode<T> curr = head;
        DoublyNode<T> newNode = new DoublyNode<T>(data);
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
       curr.setNext(newNode);
        newNode.setPrev(curr);
    }

    public void deleteAt(int at) {
    DoublyNode<T> curr = head;
     if(at == 0 || at > totalCount()) {
         System.out.println("Position should be > 0 <= totalCount");
         return;
     }
     if(at == 1) {
         head = head.getNext();
         return;
     }

    int count = 1;
    while(count < at) {
        curr = curr.getNext();
        count++;
     }
     if(at == totalCount()) {
         curr.getPrev().setNext(null);
         return;
     }
      DoublyNode<T> currPrev = curr.getPrev();
      DoublyNode<T> currNext = curr.getNext();
      currPrev.setNext(currNext);
      currNext.setPrev(currPrev);
    }

    public void deleteElement(T data) {
        DoublyNode<T> curr = head;
        if(data == curr.getData()) {
            head = head.getNext();
            return;
        }

        while (curr.getNext() != null) {

            if(curr.getData().compareTo(data) == 0)
                break;
            curr = curr.getNext();
        }
        if(curr.getNext() == null) {
            curr.getPrev().setNext(null);
            return;
        }
        DoublyNode<T> currPrev = curr.getPrev();
        DoublyNode<T> currNext = curr.getNext();
        currPrev.setNext(currNext);
        currNext.setPrev(currPrev);
    }
    public void printList() {
        DoublyNode<T> curr = head;
        if(head == null)
            System.out.println("head is null");
        while(curr != null) {
            System.out.print(curr.getData() +"->");
            curr = curr.getNext();
        }
        System.out.println();
    }

    public int totalCount() {
        int count = 0;
        DoublyNode<T> curr = head;
        while(curr != null){
            count++;
            curr = curr.getNext();
        }
        return  count;
    }


}

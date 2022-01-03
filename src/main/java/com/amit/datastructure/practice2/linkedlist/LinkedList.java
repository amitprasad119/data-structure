package com.amit.datastructure.practice2.linkedlist;

class LinkedList<T extends Comparable<T>> {
    private Node<T> head = null;

   // append the list
   void addNode(T data) {
       if(head == null)
           head = new Node<>(data);
       else {
           Node<T> currPtr = head;
           while (currPtr.getNext() != null ) {
               currPtr = currPtr.getNext();
           }
           currPtr.setNext(new Node<>(data));
       }
   }

   //prepend the list
    void addListBeg(T data) {
       Node<T> newNode = new Node<>(data);
       if(head == null)
           head = newNode;
       else {
           newNode.setNext(head);
           head = newNode;
       }
    }

    void insertAtPosition(int pos,T data) throws Exception {
       if(countNode() < pos) {
           throw new Exception("Operation Not possible since total node is less than pos");
       }
       int count = 0;
       Node<T> curr = head;
       Node<T> prev = null;
       Node<T> newNode = new Node<>(data);
       while (curr != null) {
           count++;
           if(count == pos)
               break;
           prev = curr;
           curr = curr.getNext();
       }
       prev.setNext(newNode);
       newNode.setNext(curr);
    }

    void delete() {
       if(head == null) {
           System.out.println("Nothing to delete");
           return;
       }
       Node<T> curr = head;
       while (curr.getNext().getNext() != null) {
         curr =  curr.getNext();
       }
       curr.setNext(null);
    }

    void deleteAtPos(int pos) {
       if( pos == 1) {
           head = head.getNext();
       }
        if(pos > countNode()) {
            System.out.println("Not possible to delete , out of range");
            return;
        }
        if (pos == countNode() - 1) {
            delete();
        }

        Node<T> prev = null;
        Node<T> curr = head;
        int count = 0;

        while (count != pos-1) {
            prev = curr;
            curr = curr.getNext();
            count++;
        }
        prev.setNext(curr.getNext());
    }

    int countNode() {
       Node<T> currNode = head;
       int totalCount =0;
       while (currNode != null) {
           totalCount++;
           currNode = currNode.getNext();
       }
       return totalCount;
    }

     int countNodeRec() {
      return countNodeRec(head);
     }

     int countNodeRec( Node head ) {
       if(head == null) {
           return 0;
       }
       return 1 + countNodeRec(head.getNext());
    }



   void printList() {
       Node<T> curr = head;
       System.out.println();
       while (curr != null) {
           System.out.print(curr.getData() + " -> ");
           curr = curr.getNext();
       }
   }

}

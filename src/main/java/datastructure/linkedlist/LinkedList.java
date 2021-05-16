package datastructure.linkedlist;

public class LinkedList<T extends Comparable<T>> implements Cloneable {
    private Node<T> head = null;

    LinkedList() {
    }

    void addNode(T data) {
        if (head == null) {

            head = new Node<T>(data);
        } else {
            Node<T> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node<T>(data));
        }
    }

    void addToLast(T data) {
        Node<T> curr = head;
         while (curr.getNext()!=null) {
             curr = curr.getNext();
         }
         curr.setNext(new Node<T>(data));
    }

    void addToFront(T data) {
        Node<T> newNode = new Node<>(data);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
    }

    int countNodes() {
        int count = 0 ;
        Node<T> curr = head;
        while (curr!=null) {
            count++;
            curr = curr.getNext();
        }
        return  count;
    }
    //v1 using prev pointer
     void insertAtNthV1(int position, T data) {
        if(position > countNodes()) {
            System.out.println("[ERROR]Position entered are greater the total number of counts of node...");
            return;
        }
        if(position - 1 == 0) {
            addToFront(data);
        } else {
            int pos = 0;
            Node<T> curr = head;
            Node<T> prev = head;
            while (pos < position-1) {
                if (pos == position - 1) break;
                prev = curr;
                curr = curr.getNext();
                pos++;
            }
            Node<T> newNode = new Node<>(data);
            newNode.setNext(curr);
            prev.setNext(newNode);
        }
     }

    public  void insertAtNthV2(int position, T data) {
        if(position > countNodes()) {
            System.out.println("[ERROR]Position entered are greater the total number of counts of node...");
            return;
        }
        if(position -1 == 0) {
            Node<T> newNode = new Node<T>(data);
            newNode.setNext(head);
            head = newNode;
        } else {
            int pos = 0;
            Node<T> curr = head;
            while (pos < position - 1 ) {
                curr = curr.getNext();
                pos++;
            }
            Node<T> next = curr.getNext();
            curr.setNext(new Node<>(data));
            curr.getNext().setNext(next);
        }

    }


    void printList() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.getData() +"->");
            curr = curr.getNext();
        }
        System.out.println("Null");
    }
}



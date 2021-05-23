package com.amit.datastructure.linkedlist;

public class DoublyNode<T extends Comparable<T>> {
    T data;
    DoublyNode<T> next,prev;

    DoublyNode(T data) {
        this.data = data;
        setNext(null);
        setPrev(null);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    public DoublyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }



}

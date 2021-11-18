package com.amit.datastructure.practice2.queue;

import static java.lang.reflect.Array.newInstance;

public class QueueExample<T extends Comparable<T>> {
    int front,rear = -1;
    final int capacity;
    T[] queue;


    public QueueExample(int capacity,Class<T> clazz) {
        this.capacity = capacity;
        queue = (T[]) newInstance(clazz,capacity);
    }

    public static void main(String[] args) throws QueueUnderflowException,QueueOverflowException {
        QueueExample<Integer> queue = new QueueExample<>(5,Integer.class);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.display();
        queue.enqueue(55);
        queue.display();
        queue.enqueue(110);
        queue.enqueue(165);
        queue.enqueue(220);
        queue.enqueue(275);
        queue.display();
        queue.dequeue();
        queue.display();



    }

    boolean isFull() {
        return queue.length == capacity;
    }

    boolean isEmpty(){
        return front == -1;
    }

    T peek() throws QueueUnderflowException{
        if(front == -1) {
            System.out.println("Queue underflow");
            throw  new QueueUnderflowException();
        }
      return queue[front];
    }

    void enqueue(T data)  throws QueueOverflowException {
        if(rear == capacity-1) {
            System.out.println("Queue overflow");
            throw new QueueOverflowException();
        }
        if(front == -1)
            front++;
        queue[++rear] = data;
    }

    T dequeue() throws  QueueUnderflowException {
        System.out.println("Inside Dequeue");
        if(front == -1) {
            System.out.println("Queue underflow");
            throw  new QueueUnderflowException();
        }
        T value = queue[front];

        if(front >= rear) {
            rear = -1;
            front = -1;
        } else {
            front++;
        }
        return value;
    }

    void display() {
        System.out.println();
        if(isEmpty()) {
            System.out.println("Queue underflow");
            return;
        }
        for(int i = front;i<=rear;i++) {
            System.out.print(queue[i] +" ");
        }
    }

    static class QueueUnderflowException extends Exception {}
    static class QueueOverflowException extends  Exception{}
}

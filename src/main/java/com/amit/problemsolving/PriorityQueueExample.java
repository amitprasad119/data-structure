package com.amit.problemsolving;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        //min Heap
        PriorityQueue<Integer> minPQueue = new PriorityQueue<>();
        minPQueue.add(10);
        minPQueue.add(5);
        minPQueue.add(11);
        minPQueue.add(12);
        minPQueue.add(90);

        System.out.println(minPQueue);
        minPQueue.poll();
        System.out.println(minPQueue);

        //Max Heap
        PriorityQueue<Integer> maxPQueue = new PriorityQueue<>(new MyComparator());
        maxPQueue.add(10);
        maxPQueue.add(90);
        maxPQueue.add(20);
        maxPQueue.add(45);
        maxPQueue.add(100);
        System.out.println(maxPQueue);
    }

}
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o,Integer o2) {
        if(o >o2) return -1;
        if(o < o2) return  1;
        return 0;
    }
}

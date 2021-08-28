package com.amit.problemsolving;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        PriorityQueue<String> pQueueString = new PriorityQueue<>();

        pQueue.add(10);
        pQueue.add(30);
        pQueue.add(20);
        pQueue.add(40);
        pQueueString.add("amit");
        pQueueString.add("prasad");
        pQueueString.add("gopal");
        pQueueString.add("bablu");
        Iterator e = pQueue.iterator();
        while (e.hasNext()) {
            System.out.println(e.next());
        }
        Iterator iterator = pQueueString.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}

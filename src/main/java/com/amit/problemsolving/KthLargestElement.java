package com.amit.problemsolving;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 11, 5, 16, 90, 40};
        int k = 3;
        System.out.println(kthLargest(arr, k));
    }

    static int kthLargest(int[] a, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++)
            pq.add(a[i]);

        for (int i = k; i < a.length; i++) {
            if (pq.peek() < a[i]) {
                pq.remove();
                pq.add(a[i]);
            }
        }
        return pq.peek();
    }
}

package com.amit.problemsolving;

public class Majority {
    public static void main(String[] args) {
        int a[] = {3,2,3};
        System.out.println(findMajority(a));
    }
    public static  int findMajority(int[] arr) {
        int cnt = 0;
        int ele = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
                if (cnt > max) {
                    max = cnt;
                    ele = arr[i];
                }
            }
        }
        System.out.println(cnt);
        return  ele;
    }
}

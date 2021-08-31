package com.amit.problemsolving.dp;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int max = 0;
        int j = 0;
        Set<Integer> hashset = new HashSet<>();
        for(int i =0;i<arr.length;i++)
            hashset.add(arr[i]);
        for(int num: arr) {
            if(!hashset.contains(num -1)) {
              int currentNum = num;
              int currentCount = 1 ;

              while (hashset.contains(currentNum +1)) {
                  currentNum++;
                  currentCount ++;
              }
              max =  Math.max( currentCount,max);
            }

        }
        System.out.println("Max:"+max);
    }
}

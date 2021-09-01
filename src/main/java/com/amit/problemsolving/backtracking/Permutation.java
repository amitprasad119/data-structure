package com.amit.problemsolving.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Permutation {
    public static void main(String[] args) {
     int[] arr = new int[] {1,2,3};
      Permutation p = new Permutation();
      p.permutation(arr,new ArrayList<>(),new boolean[arr.length]);
      p.permutation(arr,new ArrayList<>(),new boolean[arr.length]);

    }

    void permutation(int[] arr, ArrayList<Integer> currentCombinationArr , boolean used[]) {
        if(currentCombinationArr.size() == arr.length) {
            System.out.println(currentCombinationArr);
            return;
        }
            for(int i=0;i< arr.length;i++) {
                if (!used[i]) {
                    used[i] = true;
                    currentCombinationArr.add(arr[i]);
                    permutation(arr, currentCombinationArr, used);
                    used[i] = false;
                    currentCombinationArr.remove(currentCombinationArr.size() - 1);
                }
            }
    }


}

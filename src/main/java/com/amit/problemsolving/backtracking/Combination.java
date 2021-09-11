package com.amit.problemsolving.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Combination {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,5,8,9,4,6};
        int[] arr2 = new int[] {1,2,3,4};

        Combination p = new Combination();
        p.targetCombination(arr,new HashSet<>(),6 ,0);
        p.combinations(arr2,new ArrayList<Integer> (),2,0);
    }

    void combinations(int [] arr,ArrayList<Integer> partial,int k,int start) {
        if(partial.size() ==k){
            System.out.println(partial);
            return;
        }
        if(start == arr.length)
            return;
        for(int i = start;i< arr.length;i++)
        {
                 partial.add(arr[i]);
                 combinations(arr,partial,k,i+1);
                 partial.remove(partial.size()-1);
        }
    }



    public void targetCombination(int[] arr,HashSet<Integer> combinations,int target,int i) {
        if(combinations.stream().mapToInt(Integer ::intValue).sum() == target) {
            System.out.println(combinations);
            return;
        }
        if(i == arr.length) return;
               combinations.add(arr[i]);
               targetCombination(arr, combinations, target,i+1);
               combinations.remove(arr[i]);
               targetCombination(arr, combinations, target,i+1);

    }
}

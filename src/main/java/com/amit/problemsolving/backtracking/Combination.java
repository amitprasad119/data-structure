package com.amit.problemsolving.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Combination {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,8};
        Combination p = new Combination();
      //  p.combination(arr,new ArrayList<>(),3,0);
        p.combinationAlternative(arr,new HashSet<>(),0,3);
    }

    void combination(int a[],  ArrayList<Integer> combinationArr,int k,int index) {
        if(combinationArr.size() == k)
        {
            System.out.println(combinationArr);
            return;
        }
          if(index == a.length){
              return;
          }

            combinationArr.add(a[index]);
            combination(a,combinationArr,k,index+1);
            combinationArr.remove(a[index]);
            combination(a,combinationArr, k,index+1);

    }

    public  void combinationAlternative(int[] input,  HashSet<Integer>  partial, int i, int k){
        if(partial.size() == k){
            System.out.println(Arrays.toString(partial.toArray()));
            return;
        }
        if(i == input.length){
            return;
        }
        partial.add(input[i]);
        combinationAlternative(input,partial,i+1,k);
        partial.remove(input[i]);
        combinationAlternative(input,partial,i+1,k);
    }
}

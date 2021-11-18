package com.amit.problemsolving;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
     int index =  removeDuplicate(arr);
        Arrays.stream(arr).limit(index).forEach( System.out::println);

    }
    public static int removeDuplicate(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for(int i =0;i<nums.length-1;i++) {
            if(nums[i] != nums[i+1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j++] = nums[nums.length-1];
        return j;
    }
}

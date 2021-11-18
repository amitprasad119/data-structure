package com.amit.problemsolving;

import org.jetbrains.annotations.NotNull;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 3, 12};
         moveZeros(arr);
         for(int a: arr)
             System.out.print(a +",");
    }

    public static void moveZeros(@NotNull int arr[]) {
        int cnt = 0;
        for(int i =0;i<arr.length;i++) {
            if(arr[i] > 0) {
                arr[cnt++] = arr[i];
            }
        }
        for(int i = cnt;i<arr.length;i++)
            arr[i]=0;
    }
}

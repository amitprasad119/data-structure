package com.amit.problemsolving;


import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int arr[] = new int[]{0, 1, 0, 3, 12};
        moveZeros(arr);
        for (int a : arr)
            System.out.print(a + ",");
        moveZeroFront(arr);
    }

    public static void moveZeros(int arr[]) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[cnt++] = arr[i];
            }
        }
        for (int i = cnt; i < arr.length; i++)
            arr[i] = 0;
    }

    public static void moveZeroFront(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0)
                left++;
            if (arr[right] > 0)
                right--;
            if (arr[left] > 0 && arr[right] == 0 && left < right) {
                int temp = arr[left];
                arr[left] = 0;
                arr[right] = temp;
            }
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}

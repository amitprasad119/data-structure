package com.amit.problemsolving;

public class ArrayRotation {
    public static void main(String[] args) {
       int [] arr =new int[] {1,2,3,4,5,6,7};
        int [] arrRight =new int[] {1,2,3,4,5,6,7};

        int d = 2;
       ArrayRotation ar = new ArrayRotation();
        ar.printArray(ar.rotateLeftN(arr,2,7));
        for(int i=0;i<d;i++)
        ar.printArray(ar.rotateLeft(arr));
        System.out.println("Rotate from right");

        for(int i=0;i<d;i++)
            ar.printArray(ar.rotateRight(arrRight,arrRight.length));
    }

    // copy first element and replace with consecutive peers till the iterations
    public int[] rotateLeft(int[] arr) {
        if(arr == null || arr.length == 0)
            return null;
         int n = arr.length;
         int temp = arr[0];
         for(int i=0;i<n-1;i++)
             arr[i] = arr[i+1];
         arr[n-1] = temp;
         return  arr;
    }

    //rotate right
    public int[] rotateRight(int[] arr,int n){
        if(arr == null || arr.length == 0)
            return null;
          int temp = arr[n-1];
          for(int i =n-1;i>0;i--)
              arr[i] = arr[i-1];
             arr[0] = temp;
        return arr;
    }

     void printArray(int[] arr) {
        for(int i =0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
         System.out.println();
     }

    public   int[] rotateLeftN(int [] arr, int d,int n) {
        int [] tempArr = new int[d];
        int [] newArray = new int[n];
        //split one array
        for(int i =0;i<d;i++)
            tempArr[i] = arr[i];
        //split second array till n
        for(int i=d;i<n;i++)
            newArray[i-d] = arr[i];

         for(int i = n-d, j=0;i<n && j<d;i++,j++)
             newArray[i] = tempArr[j];
        return newArray;
    }
}

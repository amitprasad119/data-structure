package com.amit.problemsolving;

public class FinalExample {
    final float PI = 3.14f;
    final int MAX;
    final static int MIN;
    FinalExample(){
        MAX = Integer.MAX_VALUE; // we can assign final in constructor for last and final time if not assigned at time of declared
    }
    static  {
        MIN = Integer.MIN_VALUE; // variable should be static in order to be used under static block
    }

    public static void main(String[] args) {
       FinalExample fe = new FinalExample();

        System.out.println(fe.MAX);
        System.out.println(fe.PI);
        System.out.println(fe.MIN);
    }

}

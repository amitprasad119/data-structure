package com.amit.problemsolving.recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary d = new DecimalToBinary();
        String a = d.decimalToBinary(5,"");
        System.out.println(a );
    }

     String decimalToBinary(int n,String sofar) {
         if(n==0) {
             return  sofar;
         }
         sofar = n%2 + sofar;
        return decimalToBinary(n/2,sofar);
     }
}

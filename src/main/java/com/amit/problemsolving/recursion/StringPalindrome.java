package com.amit.problemsolving.recursion;

public class StringPalindrome {

    public static void main(String[] args) {
        String s = "DAD";
        StringPalindrome sp = new StringPalindrome();
        System.out.println(sp.isStringPalindrome(s,0,s.length()-1));
    }
    boolean isStringPalindrome(String str, int i, int j) {
        System.out.println("Char[i] -> char[j]"+ str.charAt(i) + " "+ str.charAt(j));
        if(i >= j)
            return  true;
        return (str.charAt(i) == str.charAt(j)) && isStringPalindrome(str,i+1,j-1);
    }
}

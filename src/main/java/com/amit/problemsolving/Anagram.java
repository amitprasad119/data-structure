package com.amit.problemsolving;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";
        System.out.println("Is Anagram:"+ isAnagram(str1,str2) );
    }

   static boolean isAnagram(String str1,String str2) {
        int counts[] = new int[256];
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        if(a.length != b.length)
            return  false;

        for(int i =0;i<a.length;i++) {
            counts[a[i] -'a'] ++;
            counts[b[i] - 'a']--;
        }

        for(int i =0;i<256;i++){
            if(counts[i] != 0)
                return  false;
        }
        return  true;
    }
}

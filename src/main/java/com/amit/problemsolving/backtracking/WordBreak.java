package com.amit.problemsolving.backtracking;

import java.util.Arrays;
import java.util.HashSet;

public class WordBreak {
    public static void main(String[] args) {
        String [] dictArr = {"cat","cats","sand","and","dog"};
        HashSet<String> dict = new HashSet<>(Arrays.asList(dictArr));
        String str = "catsanddog";
        WordBreak wb = new WordBreak();
        wb.wordBreak(str,dict,new HashSet<>());

    }

    void wordBreak(String str , HashSet<String> dict, HashSet<String> partial) {
        if(str.length() == 0) {
            System.out.println(Arrays.toString(partial.toArray()));
            return;
        }

        for(int i=0;i<str.length();i++) {
           String word = str.substring(0,i+1);
            if(dict.contains(word)) {
                partial.add(word);
                wordBreak(str.substring(i+1),dict,partial);
                partial.remove(partial.size()-1);
            }
        }
    }
}

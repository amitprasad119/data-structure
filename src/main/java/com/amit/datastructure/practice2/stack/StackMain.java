package com.amit.datastructure.practice2.stack;

import java.util.HashMap;
import java.util.HashSet;

public class StackMain {
    static HashMap<Character,Character> matchingParen = new HashMap<>();
    static HashSet<Character> openingBrackets = new HashSet<>();
    static {
        matchingParen.put(']','[');
        matchingParen.put('}','{');
        matchingParen.put(')','(');
        openingBrackets.addAll(matchingParen.values());
    }
    public static void main(String[] args) throws Exception {
        Stack<Integer> sObj = new Stack<>(Integer.class,10);
        sObj.push(10);
        sObj.push(20);
        sObj.push(30);
        sObj.push(40);
        sObj.push(50);
        sObj.push(60);
        sObj.display();
        sObj.pop();
        System.out.println("After pop");
        sObj.display();
        System.out.println(isParenthesisMatch("[()]]"));
    }

    static boolean isParenthesisMatch(String expression ) throws Exception {
        Stack<Character> sobj = new Stack<>(Character.class,expression.length());
      for(int i =0;i< expression.length();i++)
      {
          char ch = expression.charAt(i);
          if(openingBrackets.contains(ch)) {
              sobj.push(ch);
          }
          if(matchingParen.containsKey(ch)) {
              char currentItem = sobj.pop();
              if(currentItem != matchingParen.get(ch))
                  return false;
          }
      }
      java.util.Arrays.asList();
      return sobj.top == -1;
    }
}

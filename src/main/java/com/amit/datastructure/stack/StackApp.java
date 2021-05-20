package com.amit.datastructure.stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StackApp<T extends  Comparable<T>> extends Stack<T>{

     private static Map<Character,Character> matchingParenthesis = new HashMap<>();
     private static Set<Character> openingParenthesis = new HashSet<>();

     static  {
         System.out.println("Initializing the setup for parenthesis check....");
         matchingParenthesis.put('}','{');
         matchingParenthesis.put(')','(');
         matchingParenthesis.put(']','[');
         openingParenthesis.addAll(matchingParenthesis.values());
     }

    public StackApp(Class<T> clazz) {
        super(clazz);
    }

    public StackApp(int maxSize, Class<T> clazz) {
        super(maxSize, clazz);
    }

    public boolean checkParenthesis(String str,StackApp<Character> stackObj) throws StackOverflowException,StackUnderflowException {
     for(int i = 0; i< str.length(); i++) {
         Character currentChar = str.charAt(i);
         if(openingParenthesis.contains(currentChar)){
           stackObj.push(str.charAt(i));
         }
         if(matchingParenthesis.containsKey(currentChar)){
             Character currentOpening = stackObj.pop();
             // get the current opening value from matchingParenthesis
             // also pop the current bracket and match
             if(matchingParenthesis.get(currentChar) != currentOpening) {
                 return false;
             }
         }
     }
     return stackObj.isEmpty();
    }
    public static void main(String[] args) throws StackOverflowException,StackUnderflowException{
      StackApp<Character> stackObj = new StackApp<Character>(Character.class);
//        System.out.println(stackObj.checkParenthesis("[{}]",stackObj));
//        System.out.println(stackObj.checkParenthesis("[{]",stackObj));
        System.out.println(stackObj.checkParenthesis("[{abc}]",stackObj));
//        System.out.println(stackObj.checkParenthesis("[[",stackObj));
         // System.out.println(stackObj.checkParenthesis("[a]",stackObj));
    }
}

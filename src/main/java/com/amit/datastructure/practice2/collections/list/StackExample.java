package com.amit.datastructure.practice2.collections.list;

import java.util.Stack;

/**
 * Works on LIFO principle as usual
 */
public class StackExample {
    public static void main(String[] args) {
        stackOpr();
    }

    public static void stackOpr() {
        Stack<Integer> stack = new Stack();

        // we can add the element in stack either using push/add
        stack.add(1);
        stack.push(2);
        stack.add(3);
        stack.forEach(System.out::println);

        // we can remove the data using pop() or remove()
        System.out.println("Pop out");
        System.out.println( stack.pop()); // last element was 3 which got added so 3 would be removed
        System.out.println(stack.peek()); // peek will return top element without removal
    }
}

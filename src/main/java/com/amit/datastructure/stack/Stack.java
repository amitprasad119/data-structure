package com.amit.datastructure.stack;

import static java.lang.reflect.Array.newInstance;

public class Stack<T extends Comparable<T>> {
    private  static int MAX_SIZE = 5;
    private int top = -1;
    private int minStackTop = -1;
    private T[] stack;
    private T[] minStack;
     public Stack(Class<T> clazz) {
         this(MAX_SIZE,clazz);
     }
     public Stack(int maxSize,Class<T> clazz ) {
         stack = minStack  = (T[]) newInstance(clazz,maxSize);
     }
    public static void main(String[] args) throws StackOverflowException,StackUnderflowException {
        Stack<Integer> stackObj = new Stack<Integer>(Integer.class);
        stackObj.push(7);
        stackObj.push(4);
        stackObj.push(3);
        stackObj.push(1);
        stackObj.push(9);
        stackObj.printStack();
        stackObj.pop();
        System.out.println("After pop");
        stackObj.printStack();
        System.out.println("After push");
        stackObj.push(50);
        stackObj.printStack();

        System.out.println( "peek element:"+stackObj.peek());
        stackObj.printStack();
        System.out.println("Min element in stack"+stackObj.peekMinStack());

        System.out.println("Stack overflow");
        stackObj.push(60);
    }

    public void pushMinStack(T data) throws StackOverflowException ,StackUnderflowException{
        if(minStackTop == MAX_SIZE -1){
            throw  new StackOverflowException();
        }
        if(minStackTop == -1){
            minStack[++minStackTop] = data;
        }else {
            T topMinStackValue = peekMinStack();
            if (topMinStackValue.compareTo(data) > 0) {
                minStack[++minStackTop] = data;
            } else {
                minStack[++minStackTop] = topMinStackValue;
            }
        }
    }

    public T popMinStack() throws StackUnderflowException {
        if(minStackTop == -1) {
            throw  new StackUnderflowException();
        }
        return  minStack[minStackTop--];

    }

    public T peekMinStack() throws StackUnderflowException {
         if(minStackTop == -1) {
             throw new StackUnderflowException();
         }
       return   minStack[minStackTop];
    }

    public void push(T data) throws StackOverflowException,StackUnderflowException{
       if(top == MAX_SIZE - 1) {
           throw  new StackOverflowException();
       }
       stack[++top] = data;
       pushMinStack(data);
    }

    public T pop()  throws StackUnderflowException,StackUnderflowException {
       if(top == -1) {
           throw  new StackUnderflowException();
       }
        popMinStack();
       return  stack[top--];
    }

    public T peek() throws StackUnderflowException {
      if(top == -1) {
          throw new StackUnderflowException();
      }
      return stack[top];
    }

    public void printStack() {
       for(int i = 0; i<=top;i++) {
           System.out.println("[" +  i + "]" + ":" + stack[i]);
       }
    }
    public boolean isEmpty() {
         return top == -1 ;
    }
    public static class StackOverflowException extends  Exception {
    }
    public static  class StackUnderflowException extends  Exception {
    }
}

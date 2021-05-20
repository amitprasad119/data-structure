package com.amit.datastructure.stack;

public class Stack<T extends Comparable<T>> {
    private  int MAX_SIZE = 5;
    private int top = -1;
    private T[] stack;

    public static void main(String[] args) throws StackOverflowException,StackUnderflowException {
        Stack<Integer> stackObj = new Stack<>();
        stackObj.stack = new Integer[stackObj.MAX_SIZE];
        stackObj.push(10);
        stackObj.push(20);
        stackObj.push(30);
        stackObj.push(40);
        stackObj.push(50);
        stackObj.printStack();
        stackObj.pop();
        System.out.println("After pop");
        stackObj.printStack();
        System.out.println("After push");
        stackObj.push(50);
        stackObj.printStack();

        System.out.println( "peek element:"+stackObj.peek());
        System.out.println("Stack overflow");
        stackObj.push(60);
    }
    public void push(T data) throws StackOverflowException{
       if(top == MAX_SIZE - 1) {
           throw  new StackOverflowException();
       }
       stack[++top] = data;
    }

    public T pop()  throws StackUnderflowException {
       if(top == -1) {
           throw  new StackUnderflowException();
       }
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

    public static class StackOverflowException extends  Exception {

    }
    public static  class StackUnderflowException extends  Exception {
    }
}

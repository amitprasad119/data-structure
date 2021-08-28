package com.amit.datastructure.stack;

public class StackA {
    final int MAX_SIZE  = 10;
    private int[] stack = new int[MAX_SIZE];
    int top = -1;


    public int pop() throws StackUnderflowException {
        if (top == -1) {
            System.out.println("Underflow.");
           throw new StackUnderflowException();
        }
      return stack[top--];
    }

    public void push (int ele) throws StackOverflowException{
        if (top == MAX_SIZE - 1) {
            throw new StackOverflowException();
        }
        stack[++top] = ele;
    }
   public void display() {
        for(int i =0;i<=top;i++) {
            System.out.println(stack[i]);
        }
   }

    public static void main(String[] args) throws StackOverflowException,StackUnderflowException {
        StackA stack = new StackA();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.push(100);
        stack.display();
        stack.push(110);

    }

    public static class StackOverflowException extends  Exception {
        @Override
        public String toString() {
            return "Stack overflow..";
        }
    }
    public static  class StackUnderflowException extends  Exception {
        @Override
        public String toString() {
            return "Stack underflow..";
        }
    }
}

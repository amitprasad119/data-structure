package com.amit.datastructure.practice2.stack;

import static java.lang.reflect.Array.newInstance;

class Stack<T extends Comparable<T>> {
    final int MAX_SIZE;
 int top = -1;
 T[] stack;
 public Stack(Class<T> clazz, int size) {
     MAX_SIZE = size;
  stack =   (T[]) newInstance(clazz,MAX_SIZE);
 }

 void push(T data) {
     if(top == MAX_SIZE -1) {
         System.out.println("Stack overflow");
         return;
     }
    stack[++top] = data;
 }

 T pop() throws Exception {
     if( top == -1) {
         System.out.println("Stack underflow");
         throw new Exception("Stack underflow");
     }
     return stack[top--];
 }

 void display() {

     for(int i=top;i >=0;i--){
         System.out.println("----");
         System.out.println( stack[i] + "|" );

     }
 }

}

package com.amit.learning;
/***
  Parent
    ^
    |   1. first object creation
    |
  Child
    ^
    | 2. Object creation in order
    |
  Grand child    3. Object Creation in next order

 */
 class Parent {
    public Parent() {
        System.out.println("This is Parent class");
    }
}

 class Child extends  Parent {
     public Child() {
         System.out.println("This is child class");
     }
 }

class GrandChild extends  Child {
    public GrandChild() {
        System.out.println("This is Grand child class");
    }
}


public class Driver {
     public static void main(String[] args) {
         GrandChild gc = new GrandChild();
/*
           output
This is parent class
This is child class
This is Grand child class
          */
     }
 }
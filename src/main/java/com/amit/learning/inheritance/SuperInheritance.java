package com.amit.learning.inheritance;


class Parent {
    Parent() {
        System.out.println("This is parent without any constructor arguments");
    }
    Parent(int x ) {
        System.out.println("This is Parent with argument x :"+x);
    }
}

class Child extends Parent{
    Child() {
        System.out.println("This is the child without any argument");
    }
    Child(int x) {
        super(x); // calling Parent parameterized constructor , and this should be first statement in child constructor
        System.out.println("This is the child with argument x:"+x);
    }
}


public class SuperInheritance {
    public static void main(String[] args) {
        Child c = new Child(10);
    }
}

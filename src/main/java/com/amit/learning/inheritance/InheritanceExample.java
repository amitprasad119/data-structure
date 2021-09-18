package com.amit.learning.inheritance;

/***
 * This example is w.r.t the Interface
 */

interface Test {
    void method1();
    void method2();
}

class ChildImplementor implements Test {

    @Override
    public void method1() {
        System.out.println("Method1 from Sub class");
    }

    @Override
    public void method2() {
        System.out.println("Method2 from Sub class");
    }

    public void method3() {
        System.out.println("Method3 from sub class");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Test t = new ChildImplementor(); // object of child class are getting referred
        t.method1();
        t.method2();
         // method3 is not available because though object are from child class but reference type is still test
    }
}

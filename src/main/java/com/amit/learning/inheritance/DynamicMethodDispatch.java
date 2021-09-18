package com.amit.learning.inheritance;
/***
  Dynamic method dispatch
  When we create the object of child class and give the reference to Super class then
 Super class methods
 and overridden methods(From childs) are accessible

 */
class Super {
    void display1() {
        System.out.println("Display1");
    }

    void display2() {
        System.out.println("Display2");
    }
}

class Sub extends Super {
    void display1() {
        System.out.println("Sub:Display1");
    }
    void display3() {
        System.out.println("Sub display 3");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
     Super sup = new Sub();
     sup.display1(); // since overridden in Sub class so it will print Sub:Display1
     sup.display2(); // this will print from super class
     //sup.display3()    is not accessible since reference type is of Super
     Sub sub = new Sub();
     sub.display3(); // now it is accessible since reference and object both are from sub classes
    }
}

package com.amit.problemsolving;

public class StaticExample {
    int a = 10;
    static int b = 20;


    public static void main(String[] args) {
        StaticExample se = new StaticExample();
        System.out.println(se.a);
        System.out.println(se.b);
        se.b = 90;
        StaticExample se1 = new StaticExample();
        System.out.println(se1.a);
        System.out.println(se1.b); // invoking static with object
        System.out.println(StaticExample.b); // invoking static b without object
        HelloWorld.greet();

    }
    static {
        System.out.println("Okay so get ready for static example");
    }
    static  {
        System.out.println("This will be executed after first block of static");
    }

  public static  class HelloWorld {
      public static void greet () {
          System.out.println("I am hello world class main");
      }
  }
}

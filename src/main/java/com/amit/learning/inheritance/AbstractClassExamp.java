package com.amit.learning.inheritance;

abstract class Printer {

    void display() {
        System.out.println("Hello from Printer:display");
    }
   abstract void print();
}

class HPPrinter extends Printer {

    @Override
    void print() {
        System.out.println("Hello from Sub");
    }

    void nativeMethod() {
        System.out.println("Native method from HpPrinter class");
    }
}
public class AbstractClassExamp {
    public static void main(String[] args) {
        Printer hp = new HPPrinter();
        hp.print();
        //hp.nativeMethod() not accessible since reference is of type Super
    }
}

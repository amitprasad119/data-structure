package com.amit.learning.lambda;

/**
 * Three ways Lambda can be invoked as reference
 * 1. using the exiting method based on their object referece using :: operator
 * 2. using static method with the help of class name
 * 3. using constructor when we can actually send the constructor reference as <classname>::new
 */
interface  LambdaFn {
    void temparoryFn(String str);
}
public class LambdaRef {
     static void messagePrint(String msg) {
        System.out.println("Message:"+msg);
    }

    public LambdaRef(String s) {
        System.out.println("This is the message from constructor using LambdaFn:"+s);
    }
    public static void main(String[] args) {
        LambdaFn tempLambda = System.out::println; // println method is passed using out object refere
        tempLambda.temparoryFn("Hello Amit"); //

        LambdaFn tempLambdaWithStatic = LambdaRef::messagePrint; // using static method
        tempLambdaWithStatic.temparoryFn("Hello for message print");

        LambdaFn tempLambdaUsingConstructor = LambdaRef::new;
        tempLambdaUsingConstructor.temparoryFn("Hello world from constructor");
    }
}

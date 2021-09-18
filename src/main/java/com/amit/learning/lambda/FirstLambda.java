package com.amit.learning.lambda;

@FunctionalInterface // this annotation is only mandatory in case of lambda conversions
interface Greeting {
  void displayGreeting();
}
// Parameterised lambda
interface AddLambda {
    public int add(int a, int b);
}

public class FirstLambda {
    public static void main(String[] args) {
        Greeting greetL = () -> System.out.println("Hello world!");
        AddLambda addLambda = (a,b) -> a+b; // return is optional
        greetL.displayGreeting();
       int result =  addLambda.add(10,20);
        System.out.println("Add lambda result:"+result);
    }
}

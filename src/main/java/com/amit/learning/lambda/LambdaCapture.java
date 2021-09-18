package com.amit.learning.lambda;

/***
 * Lambda can access their own local variable
 * Lambda can access method variables but only if they are final or effective final
 * Lambda can access instance variable from class where it's getting call and it can change as well
 */
@FunctionalInterface
interface MessageL {
    void displayMessage();
}

class LambdaContainer {
    void callLambda(MessageL ml) {
        ml.displayMessage();
    }
}

class DemoLambda {
    void useLambda() {
        LambdaContainer lc = new LambdaContainer();
        lc.callLambda(() -> System.out.println("Hello everyone")); // creating the anonymous reference here for lambda
    }
}

public class LambdaCapture {
    public static void main(String[] args) {
        DemoLambda dl = new DemoLambda();
        dl.useLambda();
    }
}

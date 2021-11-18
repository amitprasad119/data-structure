package com.amit.problemsolving;

class Singleton {
    float PI = 3.14f;
    int r = 2 ;
    static Singleton singletonExample = null;
    static int totalCount = 0;
    Singleton() {

    }
     // this is to generate one and only one instance
     static Singleton getInstance2(){
        if(singletonExample == null)
            singletonExample =  new Singleton();
        return singletonExample;
     }

   // restrict the total object counts to 5 only
    static Singleton getInstance() {
        Singleton s = null;
        if(totalCount < 5) {
            s =   new Singleton();
            totalCount++;
        }
        else {
            System.out.println("Already 5 instances are generated....");
        }
        return  s;
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();
        Singleton s5 = Singleton.getInstance();
        System.out.println("s"+s);
        System.out.println("s1"+s1);
        System.out.println("s2"+s2);
        System.out.println("s3"+s3);
        System.out.println("s4"+s4);
        System.out.println("s5"+s5);
    }
}



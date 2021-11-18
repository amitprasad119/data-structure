package com.amit.problemsolving;

public class SingletonClass  {
    static int count = 0;
   static SingletonClass s = null;

    public static SingletonClass getInstance() {
        if(count >= 1) {
            System.out.println("returning old");
            return s;
        } else {
            count++;
            System.out.println("Creating new");
            s = new SingletonClass();
        }
        return s;
    }
    void display() {

        System.out.println("Hello from display:"+count);
    }
    private SingletonClass() {

    }

    public static void main(String[] args) {
        SingletonClass s = getInstance();
        s.display();

        SingletonClass s1 = getInstance();
        s1.display();
        SingletonClass s2 = getInstance();
        s2.display();
        SingletonClass s3 = getInstance();
        s3.display();

    }
}

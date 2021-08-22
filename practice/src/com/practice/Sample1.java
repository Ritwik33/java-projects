package com.practice;

public class Sample1 {

    static {
        System.out.println("this is static-1 executing...");
    }

    {
        System.out.println("this is init-1 executing...");
    }

    void myfunc() {
        System.out.println("this is myfunc() executing...");
    }

    public static void main(String[] args) {
        Sample1 obj = new Sample1();
        obj.myfunc();
        System.out.println("this is main executing...");
    }

    static {
        System.out.println("this is static-2 executing...");
    }

    {
        System.out.println("this is init-2 executing...");
    }
}

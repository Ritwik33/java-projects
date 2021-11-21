package com.practice;

class A {
     int a;
     A(int a) {
         this.a = a;
     }
     void show() {
         System.out.println(a);
     }
}

class B extends A {
    int b;
    B(int a, int b) {
        super(a);
        this.b = b;
    }
    void show() {
        super.show();
        System.out.println(b);
    }
}

class C extends B {
    int c;
    C(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }
    void show() {
        super.show();
        System.out.println(c);
    }
}

class Main {
    public static void main(String[] args) {
        A obj1 = new C(15, 20, 30);
        B obj2 = new C(100, 200, 300);
        C obj3 = new C(1000, 2500, 7894);
        obj1.show();
        System.out.println();
        obj2.show();
        System.out.println();
        obj3.show();
    }
}
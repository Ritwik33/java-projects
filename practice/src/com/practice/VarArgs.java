package com.practice;

public class VarArgs {
    void fun(int ... v) {
        for(int x:v) System.out.print(x + " ");
    }

    void fun(boolean ... v) {
        for (boolean x : v) System.out.print(x + " ");
    }

    public static void main(String[] args) {
        VarArgs obj = new VarArgs();
        obj.fun(1,2,3);
        obj.fun(true, false, true);
        // obj.fun(); -> ambiguous call ...
    }
}

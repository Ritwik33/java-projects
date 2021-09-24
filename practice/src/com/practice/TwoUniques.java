package com.practice;

import java.util.Scanner;

public class TwoUniques {
    int n;
    int[] arr;
    void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
    }
    void uniques() {
        int synd = 0;
        for(int i = 0;i<n;i++) synd ^= arr[i];
        int pos = 0;
        while(synd>0) {
            if((synd & 1) != 0) break;
            pos++;
            synd >>= 1;
        }
        int var1 = 0, var2 = 0;
        for(int i = 0;i<n;i++) {
            if((arr[i] & (1<<pos)) != 0) var1 ^= arr[i];
            else var2 ^= arr[i];
        }
        System.out.println(var1 + " " + var2);
    }

    public static void main(String[] args) {
        TwoUniques obj = new TwoUniques();
        obj.init();
        obj.uniques();
    }
}

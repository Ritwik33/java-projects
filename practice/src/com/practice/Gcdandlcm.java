package com.practice;

import java.util.Scanner;

public class Gcdandlcm {
    int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static void main(String[] args) {
        Gcdandlcm obj = new Gcdandlcm();
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(obj.gcd(a, b));
    }
}

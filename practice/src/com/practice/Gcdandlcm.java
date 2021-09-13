package com.practice;

import java.util.Scanner;

public class Gcdandlcm {
    static long gc(long a, long b) {
        if(b == 0) return a;
        else return gc(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        long g = gc(a, b);
        long l = (a*b)/g;
        System.out.println(g + " " + l);
    }
}

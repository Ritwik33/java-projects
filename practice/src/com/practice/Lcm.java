package com.practice;

import java.util.Scanner;

public class Lcm {

    int hcf(int a, int b) {
        if(b == 0) return a;
        return hcf(b, a%b);
    }

    public static void main(String[] args) {
        Lcm obj = new Lcm();
        Scanner sc =  new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int lcm = (a*b)/(obj.hcf(a, b));
        System.out.println(lcm);
    }
}

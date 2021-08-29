package com.practice;

import java.util.Scanner;

public class PrintingNumbersUsingRecursion {
    private static int N = 10;
    private void print1(int num) {
        if(num > N) return;
        print1(num+1);
        System.out.println(num);
    }
    private void print2(int num) {
        if(num > N) return;
        System.out.println(num);
        print1(num+1);
    }
    public static void main(String[] args) {
        PrintingNumbersUsingRecursion obj = new PrintingNumbersUsingRecursion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // obj.print1(num);
        obj.print2(num);
    }
}

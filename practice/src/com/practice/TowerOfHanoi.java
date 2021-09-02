package com.practice;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void toh(int n, char beg, char aux, char end) {
        if(n == 1) {
            System.out.println("Moving disk from " + beg + " to " + end);
            return;
        }
        toh(n-1, beg, end, aux);
        System.out.println("Moving disk from " + beg + " to " + end);
        toh(n-1, aux, beg, end);
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        toh(n, 'A', 'B', 'C');
    }
}

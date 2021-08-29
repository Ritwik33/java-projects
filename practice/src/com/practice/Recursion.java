package com.practice;

import java.util.Scanner;

public class Recursion {
    private int fib(int num) {
        if(num <= 1) return num;
        return fib(num-1) + fib(num-2);
    }
    private int fact(int num) {
        if(num <= 1) return 1;
        return num*fact(num-1);
    }
    public static void main(String[] args) {
        Recursion obj = new Recursion();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int choice;
        do{
            System.out.println("-----MAIN MENU-----");
            System.out.println("1. Fibonacci series upto n");
            System.out.println("2. Factorial of n");
            System.out.println("3. Exit");
            System.out.println("--------------------");
            System.out.print("Enter a valid choice: ");
            choice = scan.nextInt();
            System.out.println();

            switch(choice) {
                case 1:
                    System.out.println("The fibonacci series is:");
                    for(int i = 0;i<=num;i++) {
                        System.out.print(obj.fib(i) + " ");
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("The factorial of " + num + " is: " + obj.fact(num) + "\n");
                    break;
            }
        }while(choice == 1 || choice == 2);
        System.out.println("\n-------THANKYOU------");
    }
}

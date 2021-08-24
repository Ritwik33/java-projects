package com.practice;

import java.util.Scanner;

public class Series {

    public static void series1(int size) {

        //    i -> 1    2    3    4    5    6
        // term -> 1! + 2! + 3! + 4! + 5! + 6! + .....

        int fact = 1,total = 0;
        for(int i = 1;i<=size;i++){
            System.out.println("Adding factorial of "+i+" that is "+fact+" to "+total);
            total += fact;
            fact *= (i+1);
        }
        System.out.print("\nThe sum of the series is: "+total);
    }

    public static void series2(int size) {

        //    i -> 1    2    3    4    5    6
        // term -> 1! + 3! + 5! + 7! + 9! + 11! + .......

        int fact = 1,total = 0;
        for(int i = 1;i<=size;i+=2){
            System.out.println("Adding factorial of "+i+" that is "+fact+" to "+total);
            total += fact;
            fact *= (i+1)*(i+2);
        }
        System.out.print("\nThe sum of the series is: "+total);
    }

    public static void series3(int size){

        //    i -> 1    2    3    4    5     6
        // term -> 2! + 4! + 6! + 8! + 10! + 12! .....

        int fact = 1, total = 0;
        for(int i = 2;i<=size;i+=2){
            System.out.println("adding factorial of "+i+" that is "+fact+" to "+total);
            total += fact;
            fact *= (i+1)*(i+2);
        }
        System.out.print("\nThe sum of the series is: "+total);
    }

    public static void series4(int size) {

        //    i-> 1   2   3   4   5    6   7   8   9   10
        // term-> 1 + 2 + 3 + 4 + 10 + 5 + 6 + 7 + 8 + 26 + .....

        int tsum = 0,fsum = 0,term = 1;
        for(int i = 1;i<=size;i++) {
            if(i%5==0) {
                System.out.println("Adding "+tsum+" to "+fsum);
                fsum += tsum;
                tsum = 0;
            } else {
                System.out.println("Adding "+term+" to "+fsum);
                tsum+= term;
                fsum+= term;
                term++;
            }
        }
        System.out.print("\nThe final sum of the series is: "+fsum);
    }

    public static void series5(int size) {

        //    i -> 1   2   3   4   5   6
        // term -> 4 + 7 + 4 + 7 + 4 + 7 + ....

        int term = 4,total = 0;
        for(int i = 1;i<=size;i++) {
            System.out.println("Adding "+term+" to "+total);
            total += term;
            // if(term==4) term = 7; else term = 4;
            // term = 11-term;
            // term = 28/term;
            // term = (i%2==0)?4:7;
            // term = (total%11==0)?4:7;
            // term ^= 3;
            // term += (term%2==0)?3:-3;
            // term += (i%2==0)?-3:3;
            // term += Math.pow(-1,i+1)*3;
            term = (int) (5.5 + Math.pow(-1, i + 1) * 1.5);
        }
        System.out.print("\nThe final sum is: "+total);
    }

    public static void series6(int size) {

        //    i->   1    2    3    4    5
        // term->  -1! + 2! - 3! + 4! - 5! + .....

        int fact = 1, total = 0;
        for(int i = 1;i<=size;i++) {
            System.out.println("adding "+Math.pow(-1,i)*fact+" to "+total);
            total += Math.pow(-1,i)*fact;
            fact *= (i+1);
        }
        System.out.print("\nThe final sum is: "+total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size: ");
        int size = sc.nextInt();
        // series1(size);
        // series2(size);
        // series3(size);
        // series4(size);
        // series5(size);
        // series6(size);
    }

}

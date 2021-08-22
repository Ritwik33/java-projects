package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sample3 {

    public static void main(String[] args) throws IOException {
        //scanner
        System.out.print("enter first number: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("first number is: "+num1);

        //input stream reader
        System.out.print("enter second number: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int num2 = Integer.parseInt(br.readLine());
        System.out.println("second number is: "+num2);
        System.out.println("total number of command line arguments: "+args.length);

        for(int i = 0;i<args.length;i++){
            System.out.println("argument at "+i+" is: "+args[i]);
        }
        int sum = 0;
        for(String value: args){
            System.out.println("sum = "+sum);
            sum+=Integer.parseInt(value);
        }
        System.out.println("the sum is: "+sum);
        sc.close();
    }
}

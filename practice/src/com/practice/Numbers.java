package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Numbers {
    private int count_digits1(int num) {
        return (int)(Math.log10(num)+1);
    }

    private int count_digits2(int num) {
        int count = 0;
        while(num!=0) {
            num /= 10;
            count++;
        }
        return count;
    }
    private void armstrong(int low, int high) {
        int num, count, temp, last;
        for(int i = low; i<=high; i++) {
            num = i;
            count = count_digits1(num);
            temp = 0;
            while(num != 0) {
                last = num%10;
                temp += (int)(Math.pow(last, count));
                num /= 10;
            }
            if(temp == i) System.out.println(i + " is a Palindrome");
        }
    }
    private void sum_of_digits(int num) {
        int last, sum = 0;
        while(num != 0) {
            last = num%10;
            sum += last;
            num /= 10;
        }
        System.out.print("The sum of the digits is: " + sum);
    }
    private void digital_root(int num) {
        int last_digit, sum = 0;
        while(num != 0) {
            last_digit = num%10;
            sum += last_digit;
            num /= 10;
            if(num == 0 && sum>9) {
                num = sum;
                sum = 0;
            }
        }
        System.out.print("The digital root of the number is: " + sum);
    }
    public static void main(String[] args) throws IOException {
        Numbers obj = new Numbers();
        Scanner sc = new Scanner(System.in);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int low, high;
        System.out.print("Please enter the range: ");
        low = sc.nextInt();
        high = sc.nextInt();
        System.out.println();
        obj.armstrong(low, high);
        System.out.println();
        System.out.print("Please enter a number to get the sum: ");
        int num = Integer.parseInt(br.readLine());
        obj.sum_of_digits(num);
        System.out.println();
        System.out.print("Please enter a number to find digital root: ");
        int number = Integer.parseInt(br.readLine());
        obj.digital_root(number);
    }
}

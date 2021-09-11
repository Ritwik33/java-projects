package com.practice;

class Rec{
    static int count = 0;
    static long[] dp = new long[1000];
    int fact(int n) {
        if(n<=1) return 1;
        return n*fact(n-1);
    }
    long fib(int n) {
        count++;
        if(n<=1) return n;
        else if(dp[n] != 0) return dp[n];
        else {
            dp[n] = fib(n-1) + fib(n-2);
            return dp[n];
        }
    }
    int fibr(int n) {
        count++;
        if(n<=1) return n;
        return fibr(n-1) + fibr(n-2);
    }
    public static void main(String[] args) {

    }
}

package com.practice;

import java.util.Scanner;

class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n>0)&&(n&(n-1))==0);
    }
}

public class PowerOfTwo {
    public static void main(String[] args) {
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(obj.isPowerOfTwo(num));
    }
}

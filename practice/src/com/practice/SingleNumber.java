package com.practice;

public class SingleNumber {
    int meth(int[] arr) {
        int ans = arr[0];
        for(int i = 1;i<arr.length;i++) ans ^= arr[i];
        return ans;
    }
    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        System.out.println(obj.meth(new int[] {1}));
        System.out.println(obj.meth(new int[] {2, 3, 2}));
        System.out.println(obj.meth(new int[] {45, 45, 89}));
        System.out.println(obj.meth(new int[] {16, 16, 8}));
    }
}

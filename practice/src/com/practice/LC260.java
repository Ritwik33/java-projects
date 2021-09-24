package com.practice;

import java.util.Arrays;

public class LC260 {
    public int[] singlenumber(int[] nums) {
        int synd = 0;
        for(int i = 0;i<nums.length;i++) {
            synd ^= nums[i];
        }
        int pos = 0;
        int temp = synd;
        while((temp&1) == 0) {
            temp >>= 1;
            pos++;
        }
        int mask = 1<<pos;
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++) {
            if((nums[i] & mask) != 0) result[0] ^= nums[i];
        }
        result[1] = synd^result[0];
        return result;
    }
    public static void main(String[] args) {
        LC260 obj = new LC260();
        System.out.println(Arrays.toString(obj.singlenumber(new int[] {1,2,1,3,2,5})));
        System.out.println(Arrays.toString(obj.singlenumber(new int[] {-1, 2})));
        System.out.println(Arrays.toString(obj.singlenumber(new int[] {4, 5, 4, 5, 6})));
    }
}

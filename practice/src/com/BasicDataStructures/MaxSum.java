package com.BasicDataStructures;

public class MaxSum {
    public int maxSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++) {
            int sum = 0;
            for(int j = 0;j<arr.length;j++) {
                int index = (i+j)%arr.length;
                sum += j*arr[index];
            }
            max = Integer.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        MaxSum obj = new MaxSum();
        System.out.println(obj.maxSum(arr));
    }
}

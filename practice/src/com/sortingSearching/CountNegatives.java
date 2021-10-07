package com.sortingSearching;

import java.util.Scanner;

public class CountNegatives {
    int count(int[][] arr) {
        int low, high = arr[0].length-1;
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            low = 0;
            while(low<=high) {
                int mid = low + (high-low)/2;
                if(arr[i][mid] < 0) high = mid-1;
                else low = mid+1;
            }
            count += arr[i].length - low;
        }
        return count;
    }

    public static void main(String[] args) {
        CountNegatives obj = new CountNegatives();
        int row, col;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0;i<row;i++) {
            for(int j = 0;j<col;j++) arr[i][j] = sc.nextInt();
        }
        System.out.println(obj.count(arr));
    }
}

package com.sortingSearching;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = sc.nextInt();
        for(int i = 0;i<n-1;i++) {
            if(arr[i+1] < arr[i]) {
                int temp = arr[i+1];
                for(int j = i;j>=0;j--) {
                    if(arr[j] > temp) {
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for(int i:arr) System.out.print(i + " ");
    }
}

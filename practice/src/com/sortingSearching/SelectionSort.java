package com.sortingSearching;

import java.util.Scanner;

public class SelectionSort {
    int n;
    int[] arr;
    void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter elements into the array:");
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
    }
    void display() {
        System.out.println("Array after sorting is:");
        for(int itr:arr) System.out.print(itr + " ");
    }
    void sort() {
        for(int i = 0;i<n-1;i++) {
            int small_index = i;
            for(int j = i+1;j<n;j++) {
                if(arr[small_index] > arr[j]) {
                    small_index = j;
                }
            }
            if(i != small_index) {
                int temp = arr[i];
                arr[i] = arr[small_index];
                arr[small_index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        obj.init();
        obj.sort();
        obj.display();
    }
}

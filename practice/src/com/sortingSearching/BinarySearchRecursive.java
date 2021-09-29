package com.sortingSearching;

import java.util.Scanner;

public class BinarySearchRecursive {
    int binarySearch(int low, int high, int[] arr, int key) {
        if(low>high) return -1;
        else {
            int mid = low + (high-low)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] > key) return binarySearch(low, mid-1, arr, key);
            return binarySearch(mid+1, high, arr, key);
        }
    }
    public static void main(String[] args) {
        BinarySearchRecursive obj = new BinarySearchRecursive();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++) arr[i] = sc.nextInt();
        int key = sc.nextInt();
        System.out.println(obj.binarySearch(0, size-1, arr, key));
    }
}

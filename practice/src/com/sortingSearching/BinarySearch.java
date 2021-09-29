package com.sortingSearching;

import java.util.Scanner;

public class BinarySearch {
    int[] arr;
    BinarySearch() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr = new int[size];
        for(int i = 0;i<size;i++) arr[i] = sc.nextInt();
    }
    int binarySearch(int low, int high, int key) {
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] > key) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println(obj.binarySearch(0, obj.arr.length-1, key));
    }
}

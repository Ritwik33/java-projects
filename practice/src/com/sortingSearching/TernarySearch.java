package com.sortingSearching;

import java.util.Scanner;

public class TernarySearch {
    int[] arr;
    TernarySearch(int size) {
        Scanner sc = new Scanner(System.in);
        arr = new int[size];
        for(int i = 0;i<size;i++) arr[i] = sc.nextInt();
        sc.close();
    }
    int ternarySearch(int low, int high, int key) {
        if(low>high) return -1;
        else {
            int mid1, mid2;
            mid1 = low + (high-low)/3;
            mid2 = high - (high-low)/3;
            if(arr[mid1] == key) return mid1;
            else if(arr[mid2] == key) return mid2;
            else if(key < arr[mid1]) return ternarySearch(low, mid1-1, key);
            else if(key > arr[mid1] && key < arr[mid2]) return ternarySearch(mid1+1, mid2-1, key);
            return ternarySearch(mid2+1, high, key);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        TernarySearch obj = new TernarySearch(size);
        int key = sc.nextInt();
        System.out.println(obj.ternarySearch(0, size-1, key));
        sc.close();
    }
}

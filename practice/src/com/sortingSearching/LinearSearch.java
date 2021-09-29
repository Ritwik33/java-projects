package com.sortingSearching;

import java.util.Scanner;

public class LinearSearch {
    int[] arr;
    LinearSearch() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr = new int[size];
        for(int i = 0;i<size;i++) arr[i] = sc.nextInt();
    }
    int search(int key) {
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] == key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println(obj.search(key));
    }
}

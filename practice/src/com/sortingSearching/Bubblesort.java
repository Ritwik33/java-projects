package com.sortingSearching;

import java.util.Scanner;

public class Bubblesort {
    int n;
    int[] arr;
    void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("enter elements into the array:");
        for(int i = 0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
    }
    void ordbubblSort() {
        for(int i = 0;i<n-1;i++) {
            for(int j = 0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    void modBubbleSort() {
        for(int i = 0;i<n-1;i++) {
            boolean swapped = false;
            for(int j = 0;j<n-i-1;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    void display() {
        for(int itr:arr) System.out.print(itr + " ");
    }

    public static void main(String[] args) {
        Bubblesort obj = new Bubblesort();
        obj.init();
        obj.modBubbleSort();
        // obj.ordbubblSort();
        obj.display();
    }
}



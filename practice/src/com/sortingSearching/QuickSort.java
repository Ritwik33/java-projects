package com.sortingSearching;

import java.util.Scanner;

public class QuickSort {
    int[] arr;
    QuickSort(int size) {
        Scanner sc = new Scanner(System.in);
        arr = new int[size];
        for(int i = 0;i<size;i++) arr[i] = sc.nextInt();
    }
    void swap(int loc1, int loc2) {
        int temp = arr[loc1];
        arr[loc1] = arr[loc2];
        arr[loc2] = temp;
    }
    int partition(int low, int high) {
        int i = low-1;
        int pivot = arr[high];
        for(int j = low;j<high;j++) {
            if(arr[j] < pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i+1, high);
        return i+1;
    }
    void quicksort(int low, int high) {
        if(low>=high) return;
        int pi = partition(low, high);
        quicksort(low, pi-1);
        quicksort(pi+1, high);
    }
    void display_array() {
        for(int it:arr) System.out.print(it + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        QuickSort obj = new QuickSort(size);
        obj.display_array();
        obj.quicksort(0, size-1);
        obj.display_array();
    }
}

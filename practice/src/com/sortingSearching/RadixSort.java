package com.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
    int size;
    int[] arr;
    RadixSort() {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size];
        for(int i = 0;i<size;i++) arr[i] = sc.nextInt();
    }
    void countsort(int exp) {
        int[] count = new int[10];
        for(int item:arr) count[(item/exp)%10]++;
        for(int i = 1;i<count.length;i++) count[i] += count[i-1];
        int[] output = new int[size];
        for(int i = size-1;i>=0;i--) {
            output[--count[(arr[i]/exp)%10]] = arr[i];
        }
        for(int i = 0;i<size;i++) {
            arr[i] = output[i];
        }
    }
    void radixSort() {
        int max = Arrays.stream(arr).max().getAsInt();
        for(int exp = 1;max/exp > 0;exp *= 10) {
            countsort(exp);
        }
    }
    void display_array(int[] array) {
        for(int item:array) System.out.print(item + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        RadixSort obj = new RadixSort();
        obj.display_array(obj.arr);
        obj.radixSort();
        obj.display_array(obj.arr);
    }
}

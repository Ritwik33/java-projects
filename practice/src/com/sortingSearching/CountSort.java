package com.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    int size;
    int[] arr;
    CountSort() {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        arr = new int[size];
        for(int i = 0;i<size;i++) arr[i] = sc.nextInt();
    }
    int[] sort() {
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max+1];
        for(int item:arr) {
            count[item]++;
        }
        for(int i = 1;i<count.length;i++) count[i] += count[i-1];
        int[] output = new int[arr.length];
        for(int item:arr) {
            output[--count[item]] = item;
        }
        return output;
    }
    public static void main(String[] args) {
        CountSort obj = new CountSort();
        int[] output = obj.sort();
        for(int item:output) System.out.print(item + " ");
    }
}

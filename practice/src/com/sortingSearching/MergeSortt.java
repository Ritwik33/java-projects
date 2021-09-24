package com.sortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortt {
    void merge(int[] arr, int left, int mid, int right) {
        int leftSize = mid - left +1;
        int rightSize = right - mid;
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];
        for(int i = 0;i<leftSize;i++) leftArray[i] = arr[left+i];
        for(int i = 0;i<rightSize;i++) rightArray[i] = arr[mid+1+i];
        int i, j, k;
        i = j = 0;
        k = left;
        while(i < leftSize && j < rightSize) {
            if(leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while(i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
    void mergeSort(int[] arr, int left, int right, int size) {
        if(left >= right) return;
        int mid = left + (right-left)/2;
        mergeSort(arr, left, mid, size);
        mergeSort(arr, mid+1, right, size);
        merge(arr, left, mid, right);
    }
    public static void main(String[] args) {
        MergeSortt obj = new MergeSortt();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++) arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        obj.mergeSort(arr, 0, size-1, size);
        System.out.println(Arrays.toString(arr));
    }
}

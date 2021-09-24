package com.sortingSearching;

import java.util.Scanner;

public class MergeSort {
    void merge(int arr[], int left,int m, int right) {
        // find the two subarrays to be merged
        int n1 = (m - left + 1);
        int n2 = right - m;
        // creating the temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];
        // copy the data to these temp arrays
        for(int i = 0; i < n1; i++) L[i] = arr[left + i];
        for(int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];
        // now merging the temp arrays
        // initial indexes of the merged subarray
        int k = left;
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    // main function that sorts arr[l..r] using merge()
    void sort(int arr[], int left, int right) {
        if (left < right) {
            // find the middle point
            int m = left + (right - left) / 2;
            // sort the first and second haves
            sort(arr, left, m);
            sort(arr, m + 1, right);
            // merge the dorted halves
            merge(arr, left, m, right);
        }
    }
    // a utility function print the array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    // main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = scan.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter your data items: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("So displaying the initial content of the array: ");
        printArray(arr);

        MergeSort obj = new MergeSort();
        obj.sort(arr, 0, arr.length - 1);

        System.out.println("So displaying the final sorted content of the array: ");
        printArray(arr);
    }
}

package com.BasicDataStructures;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = new int[] {4, 5, 6, 1, 2, 3};
        int min = arr[0];
        int rotations = 0;
        for(int i = 1;i<arr.length;i++) {
            if(min > arr[i]) {
                min = arr[i];
                rotations = i;
            }
        }
        System.out.println("rotations: " + rotations);
    }
}

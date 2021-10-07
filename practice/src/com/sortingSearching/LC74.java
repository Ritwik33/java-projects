// https://leetcode.com/problems/search-a-2d-matrix/
// 74. Search a 2D Matrix

package com.sortingSearching;

import java.util.Scanner;

public class LC74 {
    public void searchMatrix(int[][] matrix, int target) {
        int rows =  matrix.length;
        int cols = matrix[0].length;
        int count = rows*cols;
        int low = 0, high = count-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            int row, col;
            row = mid%cols;
            col = mid/cols;
            if(matrix[row][col] == target) {
                System.out.println(row + " " + col);
                return;
            } else if(target < matrix[row][col]) high = mid-1;
            else low = mid+1;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        rows = sc.nextInt();
        cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i = 0;i<rows;i++) {
            for(int j = 0;j<cols;j++) matrix[i][j] = sc.nextInt();
        }
        int target = sc.nextInt();
        LC74 obj = new LC74();
        obj.searchMatrix(matrix, target);
    }
}

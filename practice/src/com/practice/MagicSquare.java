package com.practice;
/*
Fill up a square matrix with dimension n x n (where n is user given odd number) with
numbers from 1 to n^2 in such a way that all row-wise, col-wise and both major diagonal-wise
sums are equal to each other. The square thus obtained is called Magic Square and the sum
is called the Magic Sum          *   *   *     row = 0             row --
                                **  **  **     col = (int)(n / 2)  col ++
for n = 5 (odd integer)        * * * * * * *
                              *  **  **  **
      0   1   2   3   4      *   *   *   *
-------------------------    (1) Limit-Check -
 0 | 17  24   1   8  15    [3/2] (a) row-folding: if (row == -1) row = (n - 1);
 1 | 23   5   7  14  16
 2 |  4   6  13  20  22    [2/3] (b) col-folding: if (col == n) col = 0;
 3 | 10  12  19  21   3
 4 | 11  18  25   2   9      [1] (c) corner-logic: if (row == -1 && col == n) {row += 2; col--;}
-------------------------
Data range = (1 to 25)       (2) Pre-Occupied-Check -
Magic Sum = 65                   [4] if (matrix[row][col] != 0) {row += 2; col--;}

*/

import java.util.Scanner;

public class MagicSquare {
    int size;
    int ms[][];
    MagicSquare() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        size = scan.nextInt();
        ms = new int[size][size];
    }
    private void fillMs() {
        int row = 0;
        int col = size/2;
        int magic_sum = 0;
        int pre_magic_sum = ((size*size + 1)*size)/2;
        System.out.println("The pre-calculated magic sum is: " + pre_magic_sum);
        for(int i = 1;i<=size*size;i++) {
            ms[row][col] = i;
            if(row == col) magic_sum += ms[row][col];
            row--;
            col++;
            if(row == -1 && col == size) {
                row += 2;
                col--;
            } else if(row == -1) {
                row = (size-1);
            } else if(col == size) {
                col = 0;
            } else if(ms[row][col] != 0) {
                row += 2;
                col--;
            }
        }
        System.out.println("The post calculated magic sum will be: " + magic_sum);
    }
    private void display_ms() {
        for(int i = 0;i<size;i++) {
            for(int j = 0;j<size;j++) {
                System.out.printf("%4d", ms[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MagicSquare ms = new MagicSquare();
        ms.fillMs();
        ms.display_ms();
    }
}

package com.practice;

import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k > n/2 + 1) {
                System.out.println("-1");
                continue;
            }
            char[][] chess = new char[n+1][n+1];
            for(int i = 0;i<chess.length;i++) {
                for(int j = 0;j<chess[i].length;j++) {
                    chess[i][j] = '.';
                }
            }
            int ind = 1;
            while(k-- > 0) {
                chess[ind][ind] = 'R';
                ind = ind + 2;
            }
            for(int i = 1;i<=n;i++) {
                for(int j = 1;j<=n;j++) {
                    System.out.print(chess[i][j]);
                }
                System.out.println();
            }
        }
    }
}

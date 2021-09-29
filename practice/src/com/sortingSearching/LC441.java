// 441. Arranging coins
// https://leetcode.com/problems/arranging-coins/

package com.sortingSearching;

import java.util.Scanner;

public class LC441 {
    public int arrangeCoins(int n) {
        int[] prefix = new int[n];
        int a = 1;
        for(int i = 0;i<n;i++) {
            prefix[i] = a;
            if(i > 0) prefix[i] += prefix[i-1];
            a++;
        }
        int low = 0, high = n-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(n == prefix[mid]) return mid+1;
            else if(n < prefix[mid]) high = mid - 1;
            else if(n > prefix[mid]) low = mid+1;
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LC441 obj = new LC441();
        System.out.println(obj.arrangeCoins(n));
        sc.close();
    }
}

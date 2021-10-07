// 441. Arranging coins
// https://leetcode.com/problems/arranging-coins/

package com.sortingSearching;

import java.util.Scanner;

public class LC441 {
    public int arrangeCoins(int n) {
        long low = 1, high = n;
        while(low<=high) {
            long mid = low + (high-low)/2;
            long sum = (mid*(mid+1))/2;
            if(n == sum) return (int)mid;
            else if(n < sum) high = mid-1;
            else if(n > sum) low = mid+1;
         }
        return (int)high;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LC441 obj = new LC441();
        System.out.println(obj.arrangeCoins(n));
        sc.close();
    }
}

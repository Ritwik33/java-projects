package com.sortingSearching;

import java.util.Arrays;

public class LC1011 {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int maxwt = Arrays.stream(weights).max().getAsInt();
        if (n <= days) return maxwt;
        int sumweight = Arrays.stream(weights).sum();
        int low = maxwt;
        int high = sumweight;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (possible(mid, weights, days))
                high = mid;
            else
                low = mid + 1;
        }
        return high;
    }
    public boolean possible(int capacity, int weights[], int days) {
        int currDaycount = 1;
        int currSumWeight = 0;
        for (int w : weights) {
            currSumWeight += w;
            if (currSumWeight > capacity) {
                currDaycount++;
                currSumWeight = w;
            }
        }
        return currDaycount <= days;
    }
    public static void main(String[] args) {
        LC1011 obj = new LC1011();
        System.out.println(obj.shipWithinDays(new int[] {1,2,3,4,5,6,7,8,9,10}, 5));
        System.out.println(obj.shipWithinDays(new int[] {3,2,2,4,1,4}, 3));
        System.out.println(obj.shipWithinDays(new int[] {1,2,3,1,1}, 4));
    }
}

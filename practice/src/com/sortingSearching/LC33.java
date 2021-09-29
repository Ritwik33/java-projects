// 33. Search in rotated sorted array
// https://leetcode.com/problems/search-in-rotated-sorted-array/

package com.sortingSearching;

import java.util.Scanner;

public class LC33 {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low, high;
        low = 0;
        high = n-1;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;
            if(nums[low] <= nums[mid]) {
                if(target >= nums[low] && target < nums[mid]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            } else {
                if(target > nums[mid] && target <= nums[high]) {
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0;i<size;i++) nums[i] = sc.nextInt();
        LC33 obj = new LC33();
        System.out.println(obj.search(nums, target));
    }
}

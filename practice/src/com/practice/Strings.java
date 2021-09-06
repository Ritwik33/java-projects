package com.practice;

public class Strings {
    public static void main(String[] args) {
        System.out.println("hello".concat(" friends"));
        System.out.println("hello".equals("hello"));
        StringBuffer str = new StringBuffer("Hello");
        str.append(" world");
        System.out.println(str);
        int[][] arr = new int[5][6];
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }
}

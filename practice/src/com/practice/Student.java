package com.practice;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

class Stud {
    private int roll;
    public void get_roll(int roll) {
        this.roll = roll;
    }
    public int display() {
        return roll;
    }
}

class Test{
    private int a;
    private String b;
    Test(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

class Sum{
    private int a, b;
    Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add() {
        return (a+b);
    }
}

class Marks {
    private int engMarks;
    private int phyMarks;
    private int mathsMarks;
    Marks(int engMarks, int phyMarks, int mathsMarks) { // parameterised constructor..
        this.engMarks = engMarks;
        this.phyMarks = phyMarks;
        this.mathsMarks = mathsMarks;
    }
    public void getter() {
        System.out.println(engMarks);
        System.out.println(mathsMarks);
        System.out.println(phyMarks);
    }
}

class Details{
    int roll;
    String name;
    static String college = "Birla institute of technology";
    Details(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    public void getter() {
        System.out.println(name + " " + roll + " " + college);
    }
}

public class Student {
    public static void main(String[] args) {
        String name = "Ritwik chatterjee";
        System.out.println(name.substring(4));
        System.out.println(name.substring(4, 10));
        System.out.println(name.contains("itwik"));
        String name1 = "Ritwik chatterjee";
        System.out.println(name.equals(name1));
        int num = 30;
        String str = String.valueOf(num); // valueOf converts any data type to string...
        System.out.println(str+10); // it is getting printed as a string and not as an integer...
        String name2 = "Hello";
        String name3 = "Meklo";
        String name4 = "Hemlo";
        System.out.println(name2.compareTo(name3)); // compares strings lexicographically and returns the difference in unicode/ ascii values....
        System.out.println(name3.compareTo(name4));
        String strng = "Ritwik";
        char[] ch = strng.toCharArray(); // converts a string to character array and initialises the contents with characters of the string...
        for(int i = 0;i<ch.length;i++) System.out.println(ch[i]);
        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println(s2.equals(s1) + " " + (s1==s2));
    }
}




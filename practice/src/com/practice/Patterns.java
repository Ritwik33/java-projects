package com.practice;

public class Patterns {

    public static void pattern1(int size) {
        for(int i = 1;i<=size;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern2(int size) {
        for(int i = 1;i<=size;i++){
            for(int j = 1;j<=size-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int size) {
        for(int i = 1;i<=size;i++){
            for(int j = 1;j<=(size-i);j++) System.out.print(".");
            for(int k = 1;k<=(2*i-1);k++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern4(int size) {
        for(int i =1;i<=size;i++){
            for(int j = 1;j<=(i-1);j++) System.out.print(".");
            for(int k = 1;k<=(2*(size-i)+1);k++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern5(int size){
        for(int i = 1;i<=size;i++){
            for(int j = 1;j<=(size-i);j++) System.out.print(".");
            for(int k = 1;k<=i;k++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern6(int size){
        for(int i = 1;i<=size;i++){
            for(int j = 1;j<=(i-1);j++) System.out.print(".");
            for(int k=1;k<=(size-i+1);k++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern7(int size){
        int s,m=(size+1)/2;
        for(int i = 1;i<=size;i++){
            s=(i<=m)?(size-m-i+2):(i-m+1);
            for(int j = 1;j<=s;j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern8(int size){
        int s,m=(size+1)/2;
        for(int i = 1;i<=size;i++){
            s=(i<=m)?(i):(size-i+1);
            for(int j = 1;j<=s;j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern9(int size){
        int s,p,m=(size+1)/2;
        for(int i = 1;i<=size;i++){
            s=(i<=m)?(2*i-1):(2*(size-i)+1);
            p=(i<=m)?(m-i):(i-m);
            for(int j = 1;j<=p;j++) System.out.print(".");
            for(int k = 1;k<=s;k++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern10(int size){
        int s,p,m=(size+1)/2;
        for(int i = 1;i<=size;i++){
            s=(i<=m)?(size-2*(i-1)):(2*(i-m)+1);
            p=(i<=m)?(i-1):(2*m-i-1);
            for(int j = 1;j<=p;j++) System.out.print(".");
            for(int k=1;k<=s;k++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern11(int size){
        int s,p,m=(size+1)/2;
        for(int i=1;i<=size;i++){
            s=(i<=m)?(i):(size-i+1);
            p=(i<=m)?(m-i):(i-m);
            for(int j = 1;j<=p;j++) System.out.print(".");
            for(int k = 1;k<=s;k++) System.out.print("*");
            System.out.println();
        }
    }

    public static void pattern12(int size){
        int s,p,m=(size+1)/2;
        for(int i=1;i<=size;i++){
            p=(i<=m)?(i-1):(size-i);
            s=(i<=m)?(m-i+1):(i-(size-m));
            for(int j=1;j<=p;j++) System.out.print(".");
            for(int k=1;k<=s;k++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // pattern1(11);
        // pattern2(11);
        // pattern3(11);
        // pattern4(11);
        // pattern5(11);
        // pattern6(11);
        // pattern7(11);
        // pattern8(11);
        // pattern9(11);
        // pattern10(11);
        // pattern11(11);
        // pattern12(11);
    }
}

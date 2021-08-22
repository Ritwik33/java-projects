package com.practice;
//demonstrating variable number of arguments
public class Sample4 {

    static void valTest1(int v[]){// old process
        System.out.print("number of arguments: "+v.length+", components: ");
        for(int data:v){
            System.out.print(data+" ");
        }
        System.out.println();
    }

    static void valTest2(int ...v){// ...is the new process and is known as ellipsis operator
        System.out.print("number of arguments: "+v.length+", components: ");
        for(int data:v){
            System.out.print(data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int n1[] = {10};
        int n2[] = {12,15,16};
        int n3[] = {};

        valTest1(n1);
        valTest1(n2);
        valTest1(n3);
        System.out.println();
        valTest2(10);
        valTest2(12,15,16);
        valTest2();

    }
}

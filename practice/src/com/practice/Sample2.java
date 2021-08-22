package com.practice;

public class Sample2 {

    int num;

    public static void main(String[] args) {
        //integer variables
        byte b = 12;
        short s = 20;
        int i = 1000;
        long l = 54000000;
        System.out.println("b: "+b);
        System.out.println("s: "+s);
        System.out.println("i: "+i);
        System.out.println("l: "+l);
        //floating point variables
        float f = 21.546548f;
        double d = 25.6666666;
        System.out.println("\nf: "+f);
        System.out.println("d: "+d);
        //boolean data type
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("\nbool1: "+bool1);
        System.out.println("bool2: "+bool2);
        //user=defined data type
        Sample2 obj = new Sample2();
        obj.num = 54;
        System.out.println("\nobj.num = "+obj.num);
    }
}

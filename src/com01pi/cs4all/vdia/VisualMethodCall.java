package com01pi.cs4all.vdia;

public class VisualMethodCall {


    public static void main(String[] args) {
        int a = 1;
        int[] b = new int[1];
        b[0] = 4;
        int c = 0;
        methodA(a);
        c++;
        methodA(b[0]);
        c++;
        methodB(b);
        c++;
    }


    public static void methodA(int a) {
        a += 2;
    }


    public static void methodB(int[] a) {
        a[0] += 3;
        System.out.println("hhhhAAA");
    }


}

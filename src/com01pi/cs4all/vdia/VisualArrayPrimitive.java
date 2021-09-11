package com01pi.cs4all.vdia;

public class VisualArrayPrimitive {

    public static void main(String[] args) {

        int a;
        a = 4;
        //
        int[] arrInt;
        //
        arrInt = new int[3];
        arrInt[0] = 8;
        arrInt[2] = 5;
        arrInt[1] = 7;
        //
        arrInt[0] = a;
        a = 9;
        //
        arrInt[0] = arrInt[2];
        //
        arrInt = new int[2];
        arrInt[0] = 1;
        arrInt[1] = 2;
    }


}

package com01pi.cs4all.vdia;

public class VisualObject {


    public static void main(String[] args) {

        // simple object composed of primitive types
        Coor1D c1;
        c1 = new Coor1D(1);
        Coor1D c2 = new Coor1D(2);
        c1 = c2;
        c1.setX(9);
        c1 = new Coor1D(3);
        c1.setX(8);
    }


}

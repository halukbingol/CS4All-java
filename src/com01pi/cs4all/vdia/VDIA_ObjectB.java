package com01pi.cs4all.vdia;

public class VDIA_ObjectB {

    public static void main(String[] args) {

        // simple object composed of a primitive type
        Coor1D c1;
        c1 = new Coor1D(1);
        // complex object composed of another object
        Point1D p1;
        p1 = new Point1D("A", 7);
        Point1D p2 = new Point1D("B", 6);
        p1.setCoor(c1);
        p1.setCoor(new Coor1D(4));
        p1 = p2;
        p1.setCoor(c1);
        p1.setCoor(new Coor1D(5));
        p1 = new Point1D("C", 0);
        p1.setCoor(c1);
        p1.setCoor(new Coor1D(6));
        c1 = p1.getCoor();
        c1.setX(4);
    }

}

package com01pi.cs4all.vdia;

public class Point1D {


    String name;
    Coor1D coordinate;


    public Point1D(String name, Coor1D c) {
        this.name = name;
        this.coordinate = c;
        System.out.println("--Point1D(String name, Coor1D c)>" + " name:" + name + " c:" + c);
    }


    public Point1D(String name, int x) {
        this.name = name;
        this.coordinate = new Coor1D(x);
        System.out.println("--Point1D(String name, int x)>" + " name:" + name + " x:" + x);
    }


    public Coor1D getCoor() {
        return coordinate;
    }


    public void setCoor(Coor1D coor) {
        this.coordinate = coor;
    }


    public String toString() {
        // return "[" + "Point1D: " + name + " " + coordinate + "]";
        return name + ":" + coordinate;
    }


    public static void main(String[] args) {
        Point1D pA = new Point1D("A", 1);
        System.out.println(pA);
    }


}

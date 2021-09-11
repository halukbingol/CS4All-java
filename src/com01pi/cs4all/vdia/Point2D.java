package com01pi.cs4all.vdia;

public class Point2D {


    String name;
    Coor2D coordinate;


    public Point2D(String name, double x, double y) {
        this.name = name;
        this.coordinate = new Coor2D(x, y);
        // System.out.println(toString() + " is created.");
    }


    public Coor2D getCoordinate() {
        return this.coordinate;
    }


    public void setCoordinate(Coor2D coor) {
        this.coordinate = coor;
    }


    public String toString() {
        // return "[" + "Point: " + name + " " + coordinate + "]";
        return name + ":" + coordinate;
    }


    public static void main(String[] args) {
        Point2D pA = new Point2D("A", 1.0, 1.0);
        System.out.println(pA);
    }


}

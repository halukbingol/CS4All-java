package com01pi.cs4all.vdia;

public class Coor2D {


    double x;
    double y;


    public Coor2D(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return this.x;
    }


    public void setX(double x) {
        this.x = x;
    }


    public String toString() {
        // return "[" + "Coor2D:" + " (" + this.x + ", " + this.y + ")" + "]";
        return "(" + this.x + ", " + this.y + ")";
    }


    public static void main(String[] args) {
        Coor2D cA = new Coor2D(1.0, 1.0);
        System.out.println(cA);
    }


}

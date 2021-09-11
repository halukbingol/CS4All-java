package com01pi.cs4all.vdia;

public class Coor1D {

    int x;


    public Coor1D(int x) {
        this.x = x;
        System.out.println("--Coor1D(int x)>" + " x:" + x);
    }


    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public String toString() {
        // return "[" + "Coordinate:" + " (" + this.x + ", " + this.y + ")" + "]";
        return "(" + x + ")";
    }


    public static void main(String[] args) {
        Coor1D cA = new Coor1D(1);
        System.out.println(cA);
    }


}

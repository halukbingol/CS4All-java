package com01pi.cs4all.vdia;

public class _ObjectA {


    int identifier;

    public _ObjectA(int identifier) {
        this.identifier = identifier;
//		System.out.println(toString() + " is created");
    }

    public int getId() {
        return identifier;
    }

//    public String toString() {
//        return "[" + "ObjectA: id: " + this.identifier + "]";
//    }

    public static void main(String[] args) {
        _ObjectA a = new _ObjectA(11);
    }

}

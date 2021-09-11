package com01pi.cs4all.vdia;

public class VisualArrayObject {

    public static void main(String[] args) {
        //
        _ObjectA[] arrObjA;
        arrObjA = new _ObjectA[3];
        arrObjA[0] = new _ObjectA(15);
        arrObjA[2] = new _ObjectA(17);
        arrObjA[1] = new _ObjectA(13);
        System.out.println("A0:" + arrObjA[0]);
        System.out.println("A1:" + arrObjA[1]);
        System.out.println("A2:" + arrObjA[2]);
        //
        _ObjectA a = new _ObjectA(7);
        arrObjA[1] = a;
        System.out.println("B1:" + arrObjA[1]);
        a = new _ObjectA(20);
        System.out.println("C:" + a);
        System.out.println("C1:" + arrObjA[1]);
    }


}

package com01pi.cs4all.vdia;

public class _VisualizeObjectA {


    public static void main(String[] args) {
        _ObjectA a;
        a = new _ObjectA(7);
        System.out.println("A:" + a);
        _ObjectA b = new _ObjectA(5);
        System.out.println("B:" + b);
        _ObjectA c = new _ObjectA(3);
        System.out.println("C:" + c);
        c = a;
        System.out.println("D:" + c);
        c = new _ObjectA(8);
        System.out.println("E:" + a);
        System.out.println("F:" + c);
        //
        _ObjectA[] arrObjA;
        arrObjA = new _ObjectA[3];
        arrObjA[0] = new _ObjectA(15);
        arrObjA[2] = new _ObjectA(17);
        arrObjA[1] = new _ObjectA(13);
        System.out.println("AA:" + arrObjA[0]);
        System.out.println("AB:" + arrObjA[1]);
        System.out.println("AC:" + arrObjA[2]);
        arrObjA[1] = a;
        System.out.println("AD:" + arrObjA[1]);
        a = new _ObjectA(20);
        System.out.println("AE:" + arrObjA[1]);
        System.out.println("G:" + a);
    }


}

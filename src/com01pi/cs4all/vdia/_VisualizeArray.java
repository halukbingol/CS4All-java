package com01pi.cs4all.vdia;

public class _VisualizeArray {


    public static void main(String[] args) {

        // some statements
        System.out.println("\n" + "--" + "ObjectA a;");
        _ObjectA a;
        // System.out.println(a);

        // some statements
        System.out.println("\n" + "--" + "a = new ObjectA(5);");
        a = new _ObjectA(5);
        System.out.println(a);

        // some statements
        System.out.println("\n" + "--" + "ObjectA b = new ObjectA(3);");
        _ObjectA b = new _ObjectA(3);
        System.out.println(b);

        // some statements
        System.out.println("\n" + "--" + "ObjectA c = new ObjectA(7);");
        _ObjectA c = new _ObjectA(7);
        System.out.println(c);

        // some statements
        System.out.println("\n" + "--" + "ObjectA[] arrA;");
        _ObjectA[] arrA;
        // System.out.println(arrA);
        // System.out.println(arrA[0]);
        // System.out.println(arrA[1]);
        // System.out.println(arrA[2]);

        // some statements
        System.out.println("\n" + "--" + "arrA = new ObjectA[3];");
        arrA = new _ObjectA[3];
        System.out.println(arrA);
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);

        // some statements
        System.out.println("\n" + "--" + "arrA[0] = b;");
        arrA[0] = b;
        System.out.println(arrA);
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);

        // some statements
        System.out.println("\n" + "--" + "arrA[2] = c;");
        arrA[2] = c;
        System.out.println(arrA);
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);

        // System.out.println("arrA[1]:");
        // ObjectA d = arrA[1];
        // if (arrA[1] == null) {
        // System.out.println("null");
        // }

        arrA[1] = a;
    }


}

package com01pi.cs4all.vdia;

public class VDIA_Object_trace implements VDIA_Constants {

    public static void main(String[] args) {
        String cu = U + "  "; // undefined
        String cz = N + "  ";
        // uninitialized
        // "? ";
        /**/System.out.println("Statement                           " + " | " + "c1 " + " c2 ");
        /**/System.out.println("------------------------------------" + " | " + "---" + " ---");

        // simple object composed of primitive types
        /**/System.out.println("// simple object ...                " + " | " + cu + S + cu);

        Coor1D c1;
        /**/System.out.println("Coor1D c1;                          " + " | " + cz + S + cu);

        c1 = new Coor1D(1);
        /**/System.out.println("c1 = new Coor1D(1);                 " + " | " + c1 + S + cu);

        Coor1D c2 = new Coor1D(2);
        /**/System.out.println("Coor1D c2 = new Coor1D(2);          " + " | " + c1 + S + c2);

        c1 = c2;
        /**/System.out.println("c1 = c2;                            " + " | " + c1 + S + c2);

        c1.setX(9);
        /**/System.out.println("c1.setX(9);                         " + " | " + c1 + S + c2);

        c1 = new Coor1D(3);
        /**/System.out.println("c1 = new Coor1D(3);                 " + " | " + c1 + S + c2);

        c1.setX(8);
        /**/System.out.println("c1.setX(8);                         " + " | " + c1 + S + c2);
    }

}

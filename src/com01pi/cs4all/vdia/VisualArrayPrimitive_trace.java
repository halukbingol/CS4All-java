package com01pi.cs4all.vdia;

public class VisualArrayPrimitive_trace implements VisualConstants {

    public static void main(String[] args) {
        // String u = "u"; // undefined
        // String s = S; // space
        // String ss = S; // space space
        // String z = "?"; // uninitialized
        System.out.println("statement           " + "\t|  " + "a  arrInt ");
        System.out.println("             \\index " + "\t|  " + "   0 1 2   ");
        System.out.println("----------------------" + "\t+  " + "-  - - -  ------");

        System.out.println("                      " + "\t|  " + U + SS + U + S + U + S + U + SS + U);

        int a;
        System.out.println("int a;                " + "\t|  " + N + SS + U + S + U + S + U + SS + U);

        a = 4;
        System.out.println("a = 4;                " + "\t|  " + a + SS + U + S + U + S + U + SS + U);

        int[] arrInt;
        System.out.println("int[] arrInt;         " + "\t|  " + a + SS + U + S + U + S + U + SS + N);

        arrInt = new int[3];
        System.out.println("arrInt = new int[3];  " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + arrInt[2]
                + SS + arrInt);

        arrInt[0] = 8;
        System.out.println("arrInt[0] = 8;        " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + arrInt[2]
                + SS + arrInt);

        arrInt[2] = 5;
        System.out.println("arrInt[2] = 5;        " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + arrInt[2]
                + SS + arrInt);

        arrInt[1] = 7;
        System.out.println("arrInt[1] = 7;        " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + arrInt[2]
                + SS + arrInt);

        // assignment of
        arrInt[0] = a;
        System.out.println("arrInt[0] = a;        " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + arrInt[2]
                + SS + arrInt);

        a = 9;
        System.out.println("a = 9;                " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + arrInt[2]
                + SS + arrInt);

//		System.out.println("    // pause          " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + arrInt[2]
//				+ SS + arrInt);

        arrInt[0] = arrInt[2];
        System.out.println("arrInt[0] = arrInt[2];" + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + arrInt[2]
                + SS + arrInt);

        arrInt = new int[2];
        System.out.println(
                "arrInt = new int[2];  " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + U + SS + arrInt);

        arrInt[0] = 1;
        System.out.println(
                "arrInt[0] = 1;        " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + U + SS + arrInt);

        arrInt[1] = 2;
        System.out.println(
                "arrInt[1] = 2;        " + "\t| " + S + a + SS + arrInt[0] + S + arrInt[1] + S + U + SS + arrInt);
    }


}

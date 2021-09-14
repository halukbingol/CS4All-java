package com01pi.cs4all.vdia;

//public class VisualPrimitive_trace implements VisualConstants {
public class VDIA_Primitive_trace implements VDIA_Constants {


    public static void main(String[] args) {

        /**/System.out.println("Statement " + " | " + "a" + " b" + " c" + " d");
        /**/System.out.println("----------" + " + " + "-" + " -" + " -" + " --");

        int a;
        /**/System.out.println("int a;    " + " | " + N + S + U + S + U + S + U);

        a = 4;
        /**/System.out.println("a = 4;    " + " | " + a + S + U + S + U + S + U);

        int b = 5;
        /**/System.out.println("int b = 5;" + " | " + a + S + b + S + U + S + U);

        int c = 7;
        /**/System.out.println("int c = 7;" + " | " + a + S + b + S + c + S + U);

        c = 8;
        /**/System.out.println("c = 8;    " + " | " + a + S + b + S + c + S + U);

        c = a;
        /**/System.out.println("c = a;    " + " | " + a + S + b + S + c + S + U);

        c = 9;
        /**/System.out.println("c = 9;    " + " | " + a + S + b + S + c + S + U);

        double d;
        /**/System.out.println("double d; " + " | " + a + S + b + S + c + S + N);

        d = 1.2;
        /**/System.out.println("d = 1.2;  " + " | " + a + S + b + S + c + S + d);

        d = a;
        /**/System.out.println("d = a;    " + " | " + a + S + b + S + c + S + d);

        // a = d;
        // /**/System.out.println("a = d; " + " | " + a + S + b + S + c + S + d);
        /**/System.out.println("a = d;    " + " | " + Q);

    }


}

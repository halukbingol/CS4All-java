package com01pi.cs4all.vdia;

public class VDIA_Strings {


    public static void main(String[] args) {

        String strA;
        strA = "A";
        boolean b1 = strA == "A";
        boolean b2 = strA.equals("A");
        String strB = "B";
        String strC = "AB";
        String strD;
        strD = strA + strB;
        boolean b3 = strC == strD;
        boolean b4 = strC.equals(strD);

        //
        System.out.println(strA == "A");
        System.out.println(strC == strD);
        System.out.println(strC.equals(strD));

        // Try these
        boolean b11 = "A" == "A";
        boolean b12 = "A" == "B";
        System.out.println("A == A" + ":" + ("A" == "A") + ":" + b11);
        System.out.println("A == B" + ":" + ("A" == "B") + ":" + b12);

        // Why?
        String strE = "A";
        System.out.println("strA == strE" + ":" + (strA == strE));
        System.out.println("strA.equals(strE)" + ":" + (strA.equals(strE)));

        // Why? Explain
        System.out.println("\"A\" == \"A\"" + ":" + "A" == "A");
        System.out.println("\"A\" == \"A\"" + ":" + ("A" == "A"));
    }


}

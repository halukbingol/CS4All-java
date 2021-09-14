package com01pi.cs4all.vdia;

public class VDIA_Strings_trace implements VDIA_Constants {


    public static void main(String[] args) {

        String abc = " A   B   AB";
        /**/System.out.println("Statements                      " + B + "\"A\" \"B\" \"AB\"" + S2 + "strA" + S + "strB"
                + S + "strC" + S + "strD" + S2 + "b1   " + S2 + "b2    " + S + "b3    " + S + "b4    ");
        /**/System.out.println("--------------------------------" + B + "--- --- ----" + S2 + "----" + S + "----" + S
                + "----" + S + "----" + S2 + "------" + S + "------" + S + "------" + S + "------");

        String strA;
        /**/System.out.println("String strA;                    " + B + abc + S3 + U + S4 + U + S4 + U + S4 + U + S5 + U
                + S6 + U + S6 + U + S6 + U);

        strA = "A";
        /**/System.out.println("strA = \"A\";                     " + B + abc + S3 + strA + S4 + U + S4 + U + S4 + U
                + S5 + U + S6 + U + S6 + U + S6 + U);

        boolean b1 = strA == "A";
        /**/System.out.println("boolean b1 = strA == \"A\";       " + B + abc + S3 + strA + S4 + U + S4 + U + S4 + U
                + S5 + s(b1) + S2 + U + S6 + U + S6 + U);

        boolean b2 = strA == "A";
        /**/System.out.println("boolean b2 = strA.equals(\"A\");  " + B + abc + S3 + strA + S4 + U + S4 + U + S4 + U
                + S5 + s(b1) + S2 + s(b2) + S2 + U + S6 + U);

        String strB = "B";
        /**/System.out.println("String strB = \"B\";              " + B + abc + S3 + strA + S4 + strB + S4 + U + S4 + U
                + S5 + s(b1) + S2 + s(b2) + S2 + U + S6 + U);

        String strC = "AB";
        /**/System.out.println("String strC = \"AB\";             " + B + abc + S3 + strA + S4 + strB + S4 + strC + S3
                + U + S5 + s(b1) + S2 + s(b2) + S2 + U + S6 + U);

        String strD;
        /**/System.out.println("String strD;                    " + B + abc + S3 + strA + S4 + strB + S4 + strC + S3 + U
                + S5 + s(b1) + S2 + s(b2) + S2 + U + S6 + U);

        strD = strA + strB;
        /**/System.out.println("strD = strA + strB;             " + B + abc + S3 + strA + S4 + strB + S4 + strC + S3
                + strD + S4 + s(b1) + S2 + s(b2) + S2 + U + S6 + U);

        boolean b3 = strC == strD;
        /**/System.out.println("boolean b3 = strC == strD;      " + B + abc + S3 + strA + S4 + strB + S4 + strC + S3
                + strD + S4 + s(b1) + S2 + s(b2) + S2 + s(b3) + S2 + U);

        boolean b4 = strC.equals(strD);
        /**/System.out.println("boolean b4 = strC.equals(strD); " + B + abc + S3 + strA + S4 + strB + S4 + strC + S3
                + strD + S4 + s(b1) + S2 + s(b2) + S2 + s(b3) + S2 + s(b4));
    }


    static String s(boolean b) {
        if (b) {
            return ("true ");
        } else {
            return ("false");
        }
    }


}

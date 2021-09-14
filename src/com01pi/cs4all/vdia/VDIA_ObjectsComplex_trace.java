package com01pi.cs4all.vdia;

public class VDIA_ObjectsComplex_trace implements VDIA_Constants {


    public static void main(String[] args) {
        String sA = "\"A\"";
        String sB = "\"B\"";
        /**/System.out.println("                                "
                + B + sA + S + sB
                + S3 + "strA"
                + S3 + "c1 "
                + S3 + "p1" + S + "    " + S1 + "    "
                + S3 + "p2" + S + "    " + S1 + "    ");
        /**/System.out.println("Statements                      "
                + B + "   " + S + "   "
                + S3 + "    "
                + S3 + "   "
                + S3 + "  " + S + "p1.s" + S1 + "p1.c"
                + S3 + "  " + S + "p2.s" + S1 + "p2.c");
        /**/System.out.println("--------------------------------"
                + B + "---" + S + "---"
                + S3 + "----"
                + S3 + "---"
                + S3 + "--" + S + "----" + S1 + "----"
                + S3 + "--" + S + "----" + S1 + "----");
        /**/System.out.println(
                "                                "
                        + B + "A" + S3 + "B" + S2
                        + S3 + U
                        + S6 + U
                        + S5 + U + S3 + U + S3 + U
                        + S6 + U + S3 + U + S3 + U );


        String strA;
        /**/System.out.println(
                "String strA;                    "
                        + B + "A" + S3 + "B" + S2
                        + S3 + N
                        + S6 + U
                        + S5 + U + S3 + U + S3 + U
                        + S6 + U + S3 + U + S3 + U );


        strA = "A";
        /**/System.out.println(
                "strA = \"A\";                     "
                        + B + "A" + S3 + "B" + S2
                        + S3 + strA
                        + S6 + U
                        + S5 + U + S3 + U + S3 + U
                        + S6 + U + S3 + U + S3 + U );


        Coor1D c1;
        /**/System.out.println(
                "Coor1D c1;                      "
                        + B + "A" + S3 + "B" + S2
                        + S3 + strA
                        + S6 + N
                        + S5 + U + S3 + U + S3 + U
                        + S6 + U + S3 + U + S3 + U );


        c1 = new Coor1D(1);
        /**/System.out.println(
                "c1 = new Coor1D(1);             "
                        + B + "A" + S3 + "B" + S2
                        + S3 + strA
                        + S6 + c1
                        + S3 + U + S3 + U + S3 + U
                        + S6 + U + S3 + U + S3 + U );

        Point1D p1;
        /**/System.out.println(
                "Point1D p1;                     "
                        + B + "A" + S3 + "B" + S2
                        + S3 + strA
                        + S6 + c1
                        + S3 + N + S3 + U + S3 + U
                        + S6 + U + S3 + U + S3 + U );


        p1 = new Point1D(strA, c1);
        /**/System.out.println(
                "p1 = new Point1D(strA, c1);     "
                        + B + "A" + S3 + "B" + S2
                        + S3 + strA
                        + S6 + c1
                        + S3 + N + S3 + strA + S3 + c1
                        + S4 + U + S3 + U + S3 + U );


        Point1D p2;
        /**/System.out.println(
                "Point1D p2;                     "
                        + B + "A" + S3 + "B" + S2
                        + S3 + strA
                        + S6 + c1
                        + S3 + N + S3 + strA + S3 + c1
                        + S4 + N + S3 + U + S3 + U );


        p2 = new Point1D("B", 7);
        /**/System.out.println(
                "p2 = new Point1D(\"B\", 7);       "
                        + B + "A" + S3 + "B" + S2
                        + S3 + strA
                        + S6 + c1
                        + S3 + N + S3 + strA + S3 + c1
                        + S4 + N + S3 + "B" + S3 + "(7)" );

    }


}

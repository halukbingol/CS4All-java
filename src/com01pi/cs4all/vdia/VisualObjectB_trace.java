package com01pi.cs4all.vdia;


public class VisualObjectB_trace implements VisualConstants {


    public static void main(String[] args) {
        String c_ = U + "  "; // "? ";
        String p_ = U + "    ";
        String c2 = "";
        // "? ";
        // /**/System.out.println("Statement " + " | " + "c1 " + " c2 " + " p1 " + " p2
        // ");
        // /**/System.out.println("------------------------------------" + " | " + "---"
        // + " ---" + " -----" + " -----");

        /**/System.out.println("Statement                           " + " | " + "c1 " + " p1   " + " p2   ");
        /**/System.out.println("------------------------------------" + " | " + "---" + " -----" + " -----");

        // simple object composed of primitive types
        // Coor1D c1;
        // /**/System.out.println("Coor1D c1; " + " | " + c_ + S + c_ + S + p_ + S + p_
        // + S);
        //
        // c1 = new Coor1D(1);
        // /**/System.out.println("c1 = new Coor1D(1); " + " | " + c1 + S + c_ + S + p_
        // + S + p_ + S);
        //
        // Coor1D c2 = new Coor1D(2);
        // /**/System.out.println("Coor1D c2 = new Coor1D(2); " + " | " + c1 + S + c2 +
        // S + p_ + S + p_ + S);

        Coor1D c1 = new Coor1D(1);
        /**/System.out.println("Coor1D c1 = new Coor1D(1);          " + " | " + c1 + S + c2 + S + p_ + S + p_ + S);

        // c1 = c2;
        // /**/System.out.println("c1 = c2; " + " | " + c1 + S + c2 + S + p_ + S + p_ +
        // S);
        //
        // c1.setX(9);
        // /**/System.out.println("c1.setX(9); " + " | " + c1 + S + c2 + S + p_ + S + p_
        // + S);
        //
        // c1 = new Coor1D(3);
        // /**/System.out.println("c1 = new Coor1D(3); " + " | " + c1 + S + c2 + S + p_
        // + S + p_ + S);
        //
        // c1.setX(8);
        // /**/System.out.println("c1.setX(8); " + " | " + c1 + S + c2 + S + p_ + S + p_
        // + S);

        // complex object composed of another object
        Point1D p1;
        /**/System.out.println("Point1D p1;                         " + " | " + c1 + S + c2 + S + p_ + S + p_ + S);

        p1 = new Point1D("A", 7);
        /**/System.out.println("p1 = new Point1D(\"A\", 7);           " + " | " + c1 + S + c2 + S + p1 + S + p_ + S);

        Point1D p2 = new Point1D("B", 6);
        /**/System.out.println("Point1D p2 = new Point1D(\"B\", 6);   " + " | " + c1 + S + c2 + S + p1 + S + p2);

        //
        /**/System.out.println("//                                  " + " | " + c1 + S + c2 + S + p1 + S + p2);

        p1.setCoor(c1);
        /**/System.out.println("p1.setCoor(c1);                     " + " | " + c1 + S + c2 + S + p1 + S + p2);

        p1.setCoor(new Coor1D(4));
        /**/System.out.println("p1.setCoor(new Coor1D(4));          " + " | " + c1 + S + c2 + S + p1 + S + p2);

        p1 = p2;
        /**/System.out.println("p1 = p2;                            " + " | " + c1 + S + c2 + S + p1 + S + p2);

        p1.setCoor(c1);
        /**/System.out.println("p1.setCoor(c1);                     " + " | " + c1 + S + c2 + S + p1 + S + p2);

        p1.setCoor(new Coor1D(5));
        /**/System.out.println("p1.setCoor(new Coor1D(5));          " + " | " + c1 + S + c2 + S + p1 + S + p2);

        p1 = new Point1D("C", 0);
        /**/System.out.println("p1 = new Point1D(\"C\", 0);           " + " | " + c1 + S + c2 + S + p1 + S + p2);

        p1.setCoor(c1);
        /**/System.out.println("p1.setCoor(c1);                     " + " | " + c1 + S + c2 + S + p1 + S + p2);

        p1.setCoor(new Coor1D(6));
        /**/System.out.println("p1.setCoor(new Coor1D(6));          " + " | " + c1 + S + c2 + S + p1 + S + p2);

        c1 = p1.getCoor();
        /**/System.out.println("c1 = p1.getCoor();                  " + " | " + c1 + S + c2 + S + p1 + S + p2);

        c1.setX(4);
        /**/System.out.println("c1.setX(4);                         " + " | " + c1 + S + c2 + S + p1 + S + p2);
    }


}

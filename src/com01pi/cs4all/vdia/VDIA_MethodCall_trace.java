package com01pi.cs4all.vdia;

public class VDIA_MethodCall_trace implements VDIA_Constants {


    public static void main(String[] args) {
        String mA = B + U + S6;
        String mB = B + U;
        // " ?"
        /**/System.out.println("                                " + B + "main " + B + "methodA" + B + "methodB");
        /**/System.out.println("                                " + B + "a b c" + B + "a      " + B + "b");
        /**/System.out.println("Statement                 \\index" + B + "  0  " + B + "       " + B + "0");
        /**/System.out.println("--------------------------------" + P + "- - -" + P + "-      " + P + "-");

        int a = 1;
        /**/System.out.println("int a = 1;                      " + B + a + S + U + S + U + mA + mB);

        int[] b = new int[1];
        /**/System.out.println("int[] b = new int[1];           " + B + a + S + b[0] + S + U + mA + mB);

        b[0] = 4;
        /**/System.out.println("b[0] = 4;                       " + B + a + S + b[0] + S + U + mA + mB);

        int c = 0;
        /**/System.out.println("int c = 0;                      " + B + a + S + b[0] + S + c + mA + mB);

        /**/System.out.println("methodA(a);>                    " + B + a + S + b[0] + S + c + mA + mB);
        methodA(a);
        /**/System.out.println("methodA(a);<                    " + B + a + S + b[0] + S + c + mA + mB);

        // System.out.println("a:" + c + S + a + " b[0]:" + b[0]);
        // /**/System.out.println("System.out.println(a+\" \"+b[0]); " + B + c + S
        // + a + S
        // + b[0] + mA + mB);

        c++;
        /**/System.out.println("c++;                            " + B + a + S + b[0] + S + c + mA + mB);

        /**/System.out.println("methodA(b[0]);>                 " + B + a + S + b[0] + S + c + mA + mB);
        methodA(b[0]);
        /**/System.out.println("methodA(b[0]);<                 " + B + a + S + b[0] + S + c + mA + mB);

        c++;
        /**/System.out.println("c++;                            " + B + a + S + b[0] + S + c + mA + mB);

        // System.out.println("a:" + c + S + a + " b[0]:" + b[0]);
//		/**/System.out.println("System.out.println(a+\" \"+b[0]); " + B + a + S + b[0] + S + c + mA + mB);

        /**/System.out.println("methodB(b);>                    " + B + a + S + b[0] + S + c + mA + mB);
        methodB(b);
        /**/System.out.println("methodB(b);<                    " + B + a + S + b[0] + S + c + mA + mB);

        c++;
        /**/System.out.println("c++;                            " + B + a + S + b[0] + S + c + mA + mB);
    }


    public static void methodA(int a) {
        String mM = U + S + U + S + U + B;
        String mB = S6 + B + U;
        // " ?"
        /**/System.out.println("  methodA/(int a)               " + B + mM + a + mB);

        a += 2;
        /**/System.out.println("  methodA/a += 2;               " + B + mM + a + mB);

        // /**/System.out.println(" methodA/out " + B + mM + a + mB);
    }


    public static void methodB(int[] a) {
        String mM = U + S + U + S + U + B + U;
        String mA = S6 + B;
        // "? "
        /**/System.out.println("  methodB/(int[] a)             " + B + mM + mA + a[0]);

        a[0] += 3;
        /**/System.out.println("  methodB/a[0] += 3;            " + B + mM + mA + a[0]);

        // /**/System.out.println(" methodB/out " + B + mM + mA + b[0]);
    }


}
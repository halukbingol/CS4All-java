package com01pi.cs4all.vdia;

public class VDIA_ScopeMethodSingle_trace implements VDIA_Constants { // level0 class

    static int a = 1;


    public static void main(String[] args) { // level1 main

        int b = a + 2;

        { // level2

            int c = a + b + 3;

            { // level3

                int d = a + b + c + 4;

                System.out.println("Statement                              " + "| " + "a" + " b" + " c" + " d");
                System.out.println("---------------------------------------" + "+ " + "-" + " -" + " -" + " -");
                System.out.println("{ // level0 class                      " + "| " + U + S + U + S + U + S + U);
                System.out.println("    static int a = 1;                  " + "| " + a + S + U + S + U + S + U);
                System.out.println("    {  // level1 main                  " + "| " + a + S + U + S + U + S + U);
                System.out.println("        int b = a + 2;                 " + "| " + a + S + b + S + U + S + U);
                System.out.println("        { // level2                    " + "| " + a + S + b + S + U + S + U);
                System.out.println("            int c = = a + b + 3;       " + "| " + a + S + b + S + c + S + U);
                System.out.println("            { // level3                " + "| " + a + S + b + S + c + S + U);
                System.out.println("                int d = a + b + c + 4; " + "| " + a + S + b + S + c + S + d);
                System.out.println("            } // level3                " + "| " + a + S + b + S + c + S + U);
                System.out.println("        } // level2                    " + "| " + a + S + b + S + U + S + U);
                System.out.println("    }  // level1 main                  " + "| " + a + S + U + S + U + S + U);
                System.out.println("}  // level0 class                     " + "| " + U + S + U + S + U + S + U);
            } // level3

        } // level2

    } // level1 main


} // level0 class

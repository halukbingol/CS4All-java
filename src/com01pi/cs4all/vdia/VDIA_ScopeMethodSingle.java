package com01pi.cs4all.vdia;

public class VDIA_ScopeMethodSingle { // level0 class

    static int a = 1;


    public static void main(String[] args) { // level1 main
        int b = a + 2;
        { // level2
            int c = a + b + 3;
            { // level3
                // int a = 9;
                // int b = 8;
                int d = a + b + c + 4;
            } // level3
        } // level2
    } // level1 main


} // level0 class

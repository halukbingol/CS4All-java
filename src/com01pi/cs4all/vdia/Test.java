package com01pi.cs4all.vdia;

public class Test {


    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        methodA();
        System.out.println(a);

        {
            int c = 9;

            {
                int d = 9;
            }
            // d=0;

        }
        // c = 8;

    }

    public static void methodA() {
        int a = 2;
        System.out.println(a);
    }

    public static void methodB(int a) {
        int b = 2;
        System.out.println(a);
    }


}

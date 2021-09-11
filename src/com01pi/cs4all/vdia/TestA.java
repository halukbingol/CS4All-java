package com01pi.cs4all.vdia;

public class TestA {


    public static void main(String[] args) {
        System.out.println("A".hashCode());
        System.out.println("A".hashCode());
        System.out.println(System.identityHashCode("A") + " " + "A".hashCode());
        System.out.println(System.identityHashCode("A") + " " + "A".hashCode());


        String strA = "A";
        String strB = "A";
        System.out.println("A1:" + "A".hashCode());
        System.out.println("A2:" + "A".hashCode());
        System.out.println("strA:" + strA.hashCode());
        System.out.println("strB:" + strB.hashCode());
        if ("A" == "A") {
            System.out.println("A == A (T):" + "aa".hashCode());
        } else {
            System.out.println("A == A (F):");
        }

        int[] a = new int[2];
        System.out.println(a);
    }


}

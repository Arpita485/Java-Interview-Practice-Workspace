package com.arpita.practice.basics;

public class Day01Variables {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        char ch = 'A';
        int x;

        System.out.println(a + b + "JAVA");
        //30Java

        System.out.println("Java" + a + b);
        //Java1020

        System.out.println(ch + 1);
        //A=65(unicode/ASCII)+ 1= 66

        System.out.println(10 + 20 + "Java" + 30 + 40);
        //30Java3040

        // System.out.println(x);

        /** compile time error
         * x local variable- JVM doesn't provide default values to local variable
         * Must initialized */

    }
}

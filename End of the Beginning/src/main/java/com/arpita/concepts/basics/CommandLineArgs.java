package com.arpita.concepts.basics;

public class CommandLineArgs {
    public static void main(String[] abc) {
        //abc- parameter from JVM

        String[] args = {"Arpita", "Sahu"};
        //args local variable inside method

        abc[0] = "Arpita";
        abc[1] = "Sahu";

        System.out.println(abc[0]);
        System.out.println(abc[1]);
    }

}

package com.arpita.String;

import java.util.Locale;

public class StringCreation {
    public static void main(String[] args){
        String a= "Arpita";

        //length
        System.out.println(a.length());

        //First Char
        System.out.println(a.charAt(0));

        //Last char
        System.out.println(a.charAt(a.length()-1));

        //LowerCase
        System.out.println(a.toLowerCase());

        //UpperCase
        System.out.println(a.toUpperCase());

        //Remove space
        System.out.println(a.trim());

        //SubString
        System.out.println(a.substring(3,6));

        //Contains
        System.out.println(a.contains("e"));

    }
}

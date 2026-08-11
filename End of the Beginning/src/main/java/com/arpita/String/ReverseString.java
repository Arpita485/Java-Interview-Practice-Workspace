package com.arpita.String;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Deeeksha";
        System.out.println(reverse(input));

    }

    private static String reverse(String Deeksha) {
        String r = "";
        int a = Deeksha.length();
        for (int i = a - 1; i >= 0; i--) {
            r = r + String.valueOf(Deeksha.charAt(i));

        }
        return r;
    }
}

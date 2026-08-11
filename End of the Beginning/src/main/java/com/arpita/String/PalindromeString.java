package com.arpita.String;

public class PalindromeString {
    public static void main(String[] args) {

        String input= "Apple";
        if (palindrome(input).equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }


    private static String palindrome(String madam) {
        String s = "";
        int l = madam.length();
        for (int i = l - 1; i >= 0; i--) {
            s = s + String.valueOf(madam.charAt(i));
        }

        return s;
    }

}

package com.arpita.ConditionalStatement;

public class LoginInValidation {
    public static void main(String[] args) {

        if (validation()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }


    private static Boolean validation() {
        String userName = "Deeksha";
        int userId = -485;

        if (userId > 0 && userName.equalsIgnoreCase("deeksha")) {
            return true;
        }
        return false;
    }
}

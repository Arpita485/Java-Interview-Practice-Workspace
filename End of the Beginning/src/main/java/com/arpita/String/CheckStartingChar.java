package com.arpita.String;

public class CheckStartingChar {
    public static void main(String[] args){

        if(check()!=null){
            System.out.println("Starts with A");
        }
        else{
            System.out.println("Not Start with A");
        }
    }
    private static String check(){
        String d= "Arpitaaa";
        int l=d.length();
        if(d.charAt(1) == 'A'){
            return d;
        }
        return null;
    }
}

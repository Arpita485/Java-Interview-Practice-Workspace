package com.arpita.ConditionalStatement;

public class GradeCalculator {
    public static void main(String[] args){
        int num=79;

        if(num>= 90 && num<=100){
            System.out.println("A");
        } else if (num>=75 && num<=89) {
            System.out.println("B");
        } else if (num>= 60 && num<=74) {
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
}

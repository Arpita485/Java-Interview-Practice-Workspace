package com.arpita.ConditionalStatement;

public class LargestOfThree {
    public static void main(String[] args){

        int a=3427;
        int b=56789;
        int c= -124303;

        if(a>b && a>c){
            System.out.println("Largest : " + a);
        }
        else if(b>a && b>c){
            System.out.println("Largest : " + b);
        }
        else{
            System.out.println("Lagrest : " + c);
        }

    }
}

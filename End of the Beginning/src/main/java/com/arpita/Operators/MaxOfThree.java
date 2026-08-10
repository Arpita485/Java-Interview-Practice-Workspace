package com.arpita.Operators;

public class MaxOfThree {
    public static void main(String[] args){

        int w=78087;
        int e=44;
        int y=99349;

        if(w>e && w>y){
            System.out.println(w+" : largest");
        }
        else if(e>w && e>y){
            System.out.println(e+ " : largest");
        }
        else{
            System.out.println(y +" : largest");
        }
    }
}

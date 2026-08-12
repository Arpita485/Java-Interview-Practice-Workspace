package com.arpita.ConditionalStatement;

public class VotingEligibility {
    public static void main(String[] args){

        int age=82;
        String nationality= "Indian";

    if(age>=18 && nationality.equalsIgnoreCase("indian")){
        System.out.println("Eligible");
    }
    else{
        System.out.println("Not Eligible");
    }


    }

}

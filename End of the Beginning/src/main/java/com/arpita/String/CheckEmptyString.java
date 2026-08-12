package com.arpita.String;

public class CheckEmptyString {
    public static void main(String[] args){

        if(checkEmpty()==true){
            System.out.println("String is Empty");
        }
        else{
            System.out.println("String is not Empty");
        }
    }
    private static Boolean checkEmpty(){
      String s=" Deekshaaa";

      if(s.isEmpty()){
          return true;
      }
      else{
          return false;
      }
    }
}

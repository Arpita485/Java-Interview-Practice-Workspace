package com.arpita.Array;

public class SumOfArrayElement {
    public static void main(String[] args){
        int sum=sumOfArr();

        if(sum!=0){
            System.out.println(sum);
        }
        else{
            System.out.println("No");
        }
    }
    private static int sumOfArr(){
        int sum=0;
        int [] arr={1,2,3,4,5};
        for(int i=0; i<arr.length; i++){
           sum=sum+arr[i];
        }
        return sum;

    }
}

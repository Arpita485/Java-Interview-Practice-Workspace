package com.arpita.Array;

public class SecondLargestElement {

    public static void main(String[] args){
        int [] arr= {1,7,9,2,2};

        int max=0;
        int temp=0;

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]>max) {
                temp=max;
               max=arr[i];

            }
        }
        System.out.println(temp);

    }
}

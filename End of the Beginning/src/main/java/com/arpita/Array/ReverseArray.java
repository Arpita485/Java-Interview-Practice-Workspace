package com.arpita.Array;

public class ReverseArray {
    public static void main(String[] args){
        int [] arr= {1,2,3,4,5};
        int l=arr.length;
        int temp=0;


        for(int i=0; i<l/2; i++) {

            temp = arr[i];
            arr[i] = arr[l - 1];
            arr[l - 1] = temp;
            l=(l-1)-i;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);}


    }
}

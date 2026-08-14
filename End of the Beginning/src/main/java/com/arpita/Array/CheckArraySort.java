package com.arpita.Array;

public class CheckArraySort {
    public static void main(String [] args) {
        if(sort()==true){
            System.out.println("Sorted Array");
        }
        else {
            System.out.println("Not Sorted Array");
        }
    }
      private static Boolean sort(){
        int [] arr={1,9,3,0,2,7};
        int temp=0;

        for(int i=0; i<=arr.length-1; i++){
            for(int j=i; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            //System.out.println(arr[i]);
        }
      return true;
    }
}

package com.arpita.Array;

public class TraverseIndexing {
    public static void main(String [] args){

        int [] arr  = {0,1,2,3,4,5};
        int l= arr.length;
        int a=arr[0];

        for(int i=0; i<l-1; i++) {
            arr[i] = arr[i + 1];
            System.out.println(arr[i]);

        }
        System.out.println(a);
        }

    }


package com.arpita.Variable.DataType;

public class SwapWithoutThird {
    public static void main(String[] args) {
        int p = 90;
        int h = 1;

        p = h + p;
        h = p - h;
        p = p - h;

        System.out.println(p);
        System.out.println(h);
    }
}

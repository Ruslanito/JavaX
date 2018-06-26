package com.ruslanito.Core_General;

/**
 * Created by user on 24.12.2016.
 */
public class Work1 {
    public static void main(String[] args) {
        System.out.println("***hello***");
        int[] numbers = new int[5];
             for (int i=0; i<numbers.length; i++){
                 numbers [i] = i*23;
                 System.out.println("numbers ["+i+"] = "+numbers[i]);
             }

    }
}

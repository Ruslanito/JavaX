package com.ruslanito.Core.Core_Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Смена массива
*/

public class ArraysStringToInt {
    public static void main(String[] args) throws Exception {
        String [] str = new String [10];
        int [] num = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
        }

        for (int i = 0; i < str.length ; i++) {
            int s = str[i].length();
            num[i] =  s;
        }

        for (int t:num) {
            System.out.println(t);
        }
    }
}
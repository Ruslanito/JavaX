package com.ruslanito.Core.Core_Arrays;


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Переверни массив
*/

public class ArraysTurnAround {
    public static void main(String[] args) throws Exception {
        int [] num = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < num.length ; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i = num.length-1; i >=0 ; i--) {
            System.out.println(num[i]);
        }
    }
}
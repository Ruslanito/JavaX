package com.ruslanito.Core.Core_Arrays;



import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class ArrysDivideIntoTwo {
    public static void main(String[] args) throws Exception {

        int [] numb = new int [20];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numb.length ; i++) {
            numb[i] = Integer.parseInt(br.readLine());
        }

        int [] num1 = new int [10];
        int [] num2 = new int [10];

        for (int i = 0; i < num1.length ; i++) {
            num1[i] = numb[i];
        }

        for (int i = 0; i <num2.length ; i++) {
            num2[i] = numb[i+10];
            System.out.println(num2[i]);
        }

    }
}
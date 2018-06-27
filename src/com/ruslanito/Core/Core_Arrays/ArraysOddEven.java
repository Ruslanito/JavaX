package com.ruslanito.Core.Core_Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class ArraysOddEven {
    public static void main(String[] args) throws Exception {
        int [] num = new int[15];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < num.length; i++) {
            if (i==0 | i%2==0){
                even = even+num[i];
            } else {
                odd = odd+num[i];
            }
        }

        if (even > odd){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
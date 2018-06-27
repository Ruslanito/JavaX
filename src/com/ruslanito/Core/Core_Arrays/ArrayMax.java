package com.ruslanito.Core.Core_Arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Массивный максимум
*/

public class ArrayMax {
    public static void main(String[] args) throws Exception {

        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [20];
        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i <array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
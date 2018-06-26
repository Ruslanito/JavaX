package com.ruslanito.Core.Core_Arrays;

/**
 * Created by user on 21.01.2017.
 */
public class ArraysForEach {
    public static void main(String[] args) {
        int sum = 0;
        int min, max;
        int num[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = (int) Math.round(Math.random() * 1000);
            }
        }

        for (int x[] : num) {
            for (int y : x) {
                System.out.print(y + " ");
                sum += y;
            }
            System.out.println();
        }

        System.out.println("Сумма элементов массива равна=" + sum);

        min = max = num[0][0];
        // for-each
        for (int x[] : num) {
            for (int y : x) {
                if (y < min) min = y;
                if (y > max) max = y;
            }
        }
        System.out.println("min and max: " + min + " и " + max);
    }
}



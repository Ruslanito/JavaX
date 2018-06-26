package com.ruslanito.Core.Core_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Увеличение размера массива на одно значение
 * Created by Ruslanito on 30.01.2017.
 */
public class ArraysWithNewLength {
    public static void main(String[] args) {
        int a[] = new int[0];// инициализация первоначального массива
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Введи элемент массива:");

        while (scanner.hasNext()) {

            int q = scanner.nextInt();

            int a1[] = new int[a.length + 1];

            for (int i = 0; i < a.length; i++) {
                a1[i] = a[i];
            }

            a1[a1.length - 1] = q;
            a = a1;

            System.out.println(Arrays.toString(a));

        }

    }
}


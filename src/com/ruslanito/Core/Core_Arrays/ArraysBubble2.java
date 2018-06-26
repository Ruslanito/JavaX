package com.ruslanito.Core.Core_Arrays;

/**
 * Created by ДОМ on 23.01.2017.
 */
public class ArraysBubble2 {
    public static void main(String[] args) {
        int s = 15;// количество элементов массива
        int mas[] = new int[s];// массив mass
        int i = 0;
        int numOfPair = 0;

        System.out.println("Исходный случайный массив");
        for (int j = 0; j < mas.length; j++) {
            mas[j] = (int) Math.round(Math.random() * 1000);
            System.out.print(mas[j] + " - ");
        }

        System.out.println();
        System.out.println("****************");
        while (true) {
            if (mas[i] > mas[i + 1]) {
                int q;
                q = mas[i];
                mas[i] = mas[i + 1];
                mas [i+1] = q;
                numOfPair = 0;
            } else {
                numOfPair++;
            }
            if (numOfPair == mas.length - 1) break;
            i++;
            if (i == mas.length - 1) {
                i = 0;
            }

            for (int x : mas)
                System.out.print(x + " ");
            System.out.println("numOfPair =" + numOfPair);
        }
    }
}

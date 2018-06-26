package com.ruslanito.Tutorials.GolovachIvan.JavaCore;

/**
 * Created by Ruslanito on 08.02.2017.
 */
public class P1_3For {
    public static void main(String[] args) {

        System.out.println("Элементы множества №1 сумма:");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Элементы множества №2 сумма:");
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Элементы множества №3 произведение:");
        for (int i = 1; i <= 10; i*=2) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Элементы множества №4 вычитание:");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i+" ");
        }

        int i=0;
        System.out.println();
        System.out.println("Элементы множества №2a сумма:");
        for (; i < 10; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Элементы множества №2b сумма:");
        for (int k = 0; k < 10;) {
            System.out.print(k+" ");
            k++;
        }

        System.out.println();
        System.out.println("Элементы множества №2c сумма:");
        for (int k = 0; ;) {
            if (k < 10) {
                System.out.print(k + " ");
                k++;
            } else {
                break;}
        }

        int k =0;
        System.out.println();
        System.out.println("Элементы множества №2d сумма:");
        for (; ;) {
            if (k < 10) {
                System.out.print(k + " ");
                k++;
            } else {
                break;}
        }

        int x =0;
        System.out.println();
        System.out.println("Элементы множества №2e сумма:");
        while (true) {
            if (x < 10) {
                System.out.print(x + " ");
                x++;
            } else {
                break;}
        }

    }
}

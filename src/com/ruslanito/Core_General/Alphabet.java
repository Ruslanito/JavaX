package com.ruslanito.Core_General;

/**
 * Алфавит и явное приведение типов
 * Created by Ruslanito on 19.02.2017.
 */
public class Alphabet {
    public static void main(String[] args) {
        char ch = 'z', ch1;
        int i, k = 0, z =1000;

        while (ch <= 'Z') {
            i = (int) ch;
            System.out.print(ch + "=" + i + "  ");
            ch++;
            k++;
            if (k == 5) {
                k = 0;
                System.out.println();
            }
        }

        k=0;
        System.out.println();
        System.out.println("* * * * * * *");
        while (z <= 1200) {
            ch1 = (char) z;
            System.out.print(ch1+"="+z+"  ");
            z++;
            k++;
            if (k == 8) {
                k = 0;
                System.out.println();
            }
        }


    }
}

package com.ruslanito.Tutorials.GolovachIvan.JavaCore;

/**
 * Created by Ruslanito on 08.02.2017.
 */
public class P1_2Swap {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int tmp;

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("вариант №1 (переменная tmp)");
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println("вариант №2 для int (без переменной)");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println("вариант №3 для int (без переменной)");
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}

package com.ruslanito.Core_General;


import java.util.Scanner;

/* 
Выводим квадрат числа
*/

public class Test {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner (System.in);
        System.out.println("Введи число а");
        a = sc.nextInt();
        sc.close();
        System.out.print(a*a);
    }
}
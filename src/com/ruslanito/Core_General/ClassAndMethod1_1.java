package com.ruslanito.Core_General;

public class ClassAndMethod1_1 {
	
    public static void main(String[] args) {
        int a = 5;
        int b = sqr(a);
        System.out.print(b);
        System.out.println();
        System.out.print(sqr(a));
    }

    public static int sqr(int a) {
        return a * a;
    }
}

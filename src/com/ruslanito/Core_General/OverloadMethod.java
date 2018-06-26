package com.ruslanito.Core_General;

/**
 * Created by user on 28.01.2017.
 */
class Overload {
    void ovl (){ // версия метода без параметров
        System.out.println("ovl без параметров");
    }
    void ovl (int a){// версия с 1-м параметром
        System.out.println("ovl с одним параметром: int a="+a);
    }
    int ovl (int a, int b){// версия с 2-мя параметрами
        System.out.println("ovl с 2-мя параметрами: int a="+a+" и int b="+b);
        return a+b;
    }
    double ovl (double a, double b){//версия с 2-мя параметрами
        System.out.println("ovl с 2-мя параметрами: double a="+a+" и double b="+b);
        return a+b;
    }
}

public class OverloadMethod {
    public static void main(String[] args) {
        Overload obj = new Overload();
        int resInt;
        double resDouble;

        System.out.println("Вызываем методы по очереди");

        obj.ovl();

        System.out.println();
        obj.ovl(5);

        System.out.println();
        resInt = obj.ovl(10,73);
        System.out.println("Результат вызова метода obj.ovl(10,73) ="+resInt);

        System.out.println();
        resDouble = obj.ovl(1.5,3.14);
        System.out.println("Результат вызова метода obj.ovl(1.5,3.14) ="+resDouble);
    }
}

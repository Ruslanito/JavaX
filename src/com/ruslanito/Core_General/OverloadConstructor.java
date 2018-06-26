package com.ruslanito.Core_General;

/**
 * Created by user on 28.01.2017.
 */
class  MyClass{
    int x;

    MyClass(){
        System.out.println("Внутри MyClass().");
        x=0;
    }

    MyClass(int i){
        System.out.println("Внутри MyClass(int).");
        x=i;
    }

    MyClass(double d){
        System.out.println("Внутри MyClass(double).");
        x=(int)d;
    }

    MyClass(int i, int j){
        System.out.println("Внутри MyClass(int, int).");
        x=i*j;
    }
}

public class OverloadConstructor {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(77);
        MyClass t3 = new MyClass(3.14);
        MyClass t4 = new MyClass(5,8);

        System.out.println("t1.x: "+t1.x);
        System.out.println("t2.x: "+t2.x);
        System.out.println("t3.x: "+t3.x);
        System.out.println("t4.x: "+t4.x);
    }
}

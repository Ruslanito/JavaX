package com.ruslanito.Core.Core_String_Char;

/**
 * Created by Ruslanito on 24.02.2017.
 */
public class String_ValueOf {
    public static void main(String[] args) {
        String s;

        System.out.println("Неявно - оператор слияния +");
        s = "" + true;
        System.out.println("boolean: " + s);
        s = "" + ((byte) 0XFF);
        System.out.println("byte: " + s);
        s = "" + 'a';
        System.out.println("char: " + s);
        s = "" + ((short) 99);
        System.out.println("short: " + s);
        s = "" + 1023;
        System.out.println("int: " + s);
        s = "" + 92489L;
        System.out.println("long: " + s);
        s = "" + 6.57F;
        System.out.println("float: " + s);
        s = "" + 6.57D;
        System.out.println("double: " + s);

        System.out.println("Явно - метод valueOf()");
        s=String.valueOf(true);
        System.out.println("boolean: " + s);
        s=String.valueOf((byte)0xFF);
        System.out.println("byte: " + s);
        s=String.valueOf('a');
        System.out.println("char: " + s);
        s=String.valueOf((short)99);
        System.out.println("short: " + s);
        s=String.valueOf(1023);
        System.out.println("int: " + s);
        s=String.valueOf(92489L);
        System.out.println("long: " + s);
        s=String.valueOf(6.57F);
        System.out.println("float: " + s);
        s=String.valueOf(6.57D);
        System.out.println("double: " + s);

    }

}

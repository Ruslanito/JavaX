package com.ruslanito.Core.Core_String_Char;

/**
 * Created by Ruslanito on 24.02.2017.
 */
public class String_IndexOf {
    public static void main(String[] args) {
        int index;
        boolean index2;
        String s1 = "Hello World!";

        System.out.print("Первое вхождение:");
        index = s1.indexOf("o");
        System.out.println(index);

        System.out.print("Последнее вхождение:");
        index = s1.lastIndexOf("o");
        System.out.println(index);

        System.out.print("Нет элемента:");
        index = s1.indexOf("a");
        System.out.println(index);

        System.out.print("Первое вхождение текста:");
        index = s1.indexOf("Hello");
        System.out.println(index);

        System.out.print("Текст в начале и в конце:");
        index2 = s1.startsWith("Hello");
        System.out.println(index2);
        index2 = s1.startsWith("World");
        System.out.println(index2);
        index2 = s1.endsWith("World!");
        System.out.println(index2);
    }
}

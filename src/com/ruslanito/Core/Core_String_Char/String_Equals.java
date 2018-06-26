package com.ruslanito.Core.Core_String_Char;

/**
 * Created by Ruslanito on 24.02.2017.
 */
public class String_Equals {
    public static void main(String[] args) {
        boolean a;
        String s = "Hello World!";
        System.out.println(s);

        System.out.print("С учетом регистра ");
        String s1= s.toLowerCase();
        a=s.equals(s1);
        System.out.println(a);

        System.out.print("Без учетом регистра ");
        a=s.equalsIgnoreCase(s1);
        System.out.println(a);



    }
}

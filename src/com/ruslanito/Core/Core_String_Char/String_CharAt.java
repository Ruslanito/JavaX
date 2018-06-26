package com.ruslanito.Core.Core_String_Char;

/**
 * Created by Ruslanito on 24.02.2017.
 */
public class String_CharAt {
    public static void main(String[] args) {
        int a = 6;
        char c;
        String s = "Hello World!";

        c=s.charAt(a);
        System.out.println("Символ '"+c+"' находится на позиции №"+a);

        String surname = "Иванов";
        String name = "Иван";
        String name2 = "Иванович";
        System.out.print(surname+" "+name+" "+name2+"  ");
        System.out.println(surname+" "+name.charAt(0)+"."+name2.charAt(0)+".");
    }
}

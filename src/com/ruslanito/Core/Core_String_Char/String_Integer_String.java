package com.ruslanito.Core.Core_String_Char;

/**
 * Created by Ruslanito on 25.02.2017.
 */
public class String_Integer_String {
    public static void main(String[] args) {
        System.out.println("Строка в целое число:");
        String s = "101";
        System.out.println(s);
        int intvalue = Integer.parseInt(s);
        System.out.println(intvalue);

        System.out.println("Целое число в строку:");
        int intv = 121;
        System.out.println(intv);
        String sv = Integer.toString(intv);
        System.out.println(sv);
    }
}

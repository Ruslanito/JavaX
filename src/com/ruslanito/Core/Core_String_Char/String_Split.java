package com.ruslanito.Core.Core_String_Char;

/**
 * Created by Ruslanito on 25.02.2017.
 */
public class String_Split {
    public static void main(String[] args) {
        String s = "мама мыла раму";
        System.out.println(s);
        String s1[] = s.split("");
        int a = s.length();
        for (int i=0; i<a;i++){
            System.out.println("s1["+i+"]="+s1[i]);
        }
    }
}

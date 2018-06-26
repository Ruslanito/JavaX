package com.ruslanito.Core_General;

/** Перевод строчных букв в прописные
 * Created by Ruslanito on 04.02.2017.
 */
public class CaseLowUpper {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 26; i++) {
            ch = (char)('a'+i);
            System.out.print(ch);

            ch = (char)((int) ch&65503);
            System.out.print(ch+" ");

        }
    }
}

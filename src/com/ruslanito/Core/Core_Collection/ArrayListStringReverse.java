package com.ruslanito.Core.Core_Collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Слова в обратном порядке (введи 5 слов, удали одно, вывод в обратном порядке)
*/

public class ArrayListStringReverse {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int k = 0; k <5; k++) {
            String s = br.readLine();
            list.add(k, s );

        }

        list.remove(2);

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
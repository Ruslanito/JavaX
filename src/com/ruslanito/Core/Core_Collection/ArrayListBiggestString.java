package com.ruslanito.Core.Core_Collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Самая длинная строка
*/

public class ArrayListBiggestString {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //1
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int maxs = 0;

        //2
        for (int i = 0; i < 5 ; i++) {
            strings.add(reader.readLine());
        }
        //3
        for (int i = 0; i < strings.size(); i++) {

            if (maxs < strings.get(i).length()) {
                maxs = strings.get(i).length();
            }
        }
        //4
        for (int i = 0; i <strings.size() ; i++) {

            if (maxs == strings.get(i).length()){
                System.out.println(strings.get(i));
            }
        }

    }
}
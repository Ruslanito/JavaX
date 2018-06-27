package com.ruslanito.Core.Core_Collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
В начало списка
*/

public class ColAddToTheBeginning {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10 ; i++) {
            list.add(0,br.readLine());
        }

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
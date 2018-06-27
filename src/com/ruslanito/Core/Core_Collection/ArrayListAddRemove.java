package com.ruslanito.Core.Core_Collection;

import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.ArrayList;

/*
Удалить и вставить
*/

public class ArrayListAddRemove {
    public static void main(String[] args) throws Exception {
        //1
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //2
        for (int i = 0; i < 5; i++) {
            list.add(br.readLine());
        }
        //3

        for (int i = 0; i < 13; i++) {

            list.add(0, list.remove(4));
        }
        //4
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}

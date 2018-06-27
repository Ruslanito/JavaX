package com.ruslanito.Core.Core_Collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
*/

public class ArrayListBiggestOrShortest {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10 ; i++) {
            list.add(br.readLine());
        }

        int max = list.get(0).length();
        int min = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i).length()) {
                min = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).length()){
                max = list.get(i).length();
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (min == list.get(i).length()){
                System.out.println(list.get(i));
                break;
            }

            else if (max == list.get(i).length()) {
                System.out.println(list.get(i));
                break;
            }

        }
    }
}
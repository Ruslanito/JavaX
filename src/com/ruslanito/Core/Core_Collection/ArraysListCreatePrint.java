package com.ruslanito.Core.Core_Collection;

import java.util.ArrayList;

/*
Что за список такой?
*/

public class ArraysListCreatePrint {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        String s = null;
        int ls = 0;
        //3
        for (int i = 0; i < 5; i++) {
            list.add(s+i);
        }
        //4

        System.out.println(list.size());

        //5
        for (String aList : list) {
            System.out.println(aList);
        }
    }
}

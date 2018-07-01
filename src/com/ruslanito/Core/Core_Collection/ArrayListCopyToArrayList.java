package com.ruslanito.Core.Core_Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCopyToArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("1");
        arrayList1.add("2");
        arrayList1.add("3");

        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Three");
        arrayList2.add("Four");
        arrayList2.add("Five");
        arrayList2.add("Six");

        System.out.println("arrayList1: "+arrayList1);
        System.out.println("arrayList2: "+arrayList2);

        Collections.copy(arrayList2,arrayList1);
        System.out.println("arrsyList2: "+ arrayList2);

    }
}

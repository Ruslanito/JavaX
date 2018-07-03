package com.ruslanito.Core.Core_Collection;

//список разбиваем на три списка и печатаем

import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.ArrayList;
        import java.util.List;

public class ArrayListToThreeArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list1 = new ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;

        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            int num = Integer.parseInt(str);
            list1.add(num);
        }

        ArrayList<Integer> listMod3 = new ArrayList();
        ArrayList<Integer> listMod2 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();

        for (int i = 0; i < list1.size(); i++) {

            x = list1.get(i);

            if (x % 3 == 0) {
                listMod3.add(x);
            }


            if  (x % 2 == 0) {
                listMod2.add(x);
            }

            if (x % 3 != 0 && x % 2 != 0) {
                list2.add(x);
            }
        }

        printList(listMod3);
        printList(listMod2);
        printList(list2);

    }

    public static void printList(List<Integer> list) {

        for (int z=0;z <list.size(); z++){
            System.out.println(list.get(z));
        }

    }
}
package com.ruslanito.Core.Core_Collection;

import java.util.ArrayList;

/*
Р или Л
Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод fix должен удалять из списка строк все слова, содержащие букву "р". Исключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
3. Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
4. Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
5. Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
*/

public class ArrayMultyOrRemove {
    public static void main(String[] args) throws Exception {
        //BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
//        System.out.println(list.size());
    }

    //доработать программу

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код

        for (int i = list.size() - 1; i >= 0; i--) {
//            System.out.println(i);
            //удвоение с л
            if (list.get(i).contains("л")) {

                if (list.get(i).contains("р")) {

                } else {
//                    System.out.println("+++");
                    list.add(i, list.get(i));
//                    System.out.println("---");
                }
            }

            //удаление с р
            if (list.get(i).contains("р")) {

                if (list.get(i).contains("л")) {
                } else {
                    list.remove(i);
//                    System.out.println("***");
                }
            }
//            System.out.println("!!!!!!!"+list.get(i)+"!!!!!!!!");

//            System.out.println("list.get(i)="+list.get(i));

        }

        return list;
    }
}
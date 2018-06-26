package com.ruslanito.Core.Core_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/** Коллекция ArrayList
 * Created by Ruslanito on 31.01.2017.
 */
public class ArraysArraysList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr;
        arr = new ArrayList();
        int z=0;// переменная выхода из цикла while

        Scanner scanner = new Scanner(System.in);

        while   (scanner.hasNext()){

            if (z==5){
                break;
            } else {

                int q = scanner.nextInt();
                arr.add(q);//добавдение элемента в колл. с помощью add в конец колл.
                System.out.println(arr);//колл. в строчку
                System.out.println("Количество элементов коллекции равно " + arr.size());//количество элементов массива

                for (int i = 0; i < arr.size(); i++) {
                    System.out.println(arr.get(i));//колл. в столбик

                }

            }
            z++;
            System.out.println("Переменная цикла ="+z);

        }

        System.out.println("Вышли из цикла");
        arr.set(2,999);//замена элемента колл.№2 на 999
        System.out.println("Заменяем элемент колл. №2 на 999");
        System.out.println(arr);

        arr.remove(1);//удаление элемента колл.№1
        System.out.println("Удаляем элемент колл. №1");
        System.out.println(arr);
    }
}

package com.ruslanito.Core.Core_Arrays;

/**
 * Created by ДОМ on 18.01.2017.
 */
public class ArraysBubble {
    public static void main(String[] args) {
        int a, b, t, sum = 0;
        int size = 15;
        int nums[] = new int[size];
        int min = 0;//поиск минимального элемента массива
        int max = 0;//поиск максимального элемента массива

        System.out.println();//случайный массив
        System.out.println("Исходный случайный массив до сортировки имеет вид:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.round(Math.random() * 100);
            System.out.print(nums[i] + " ");
        }

        for (a = 1; a < nums.length; a++) // Пузырьковая сортировка
            for (b = nums.length - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }

        System.out.println();
        System.out.println("Итоговый массив после сортировки имеет вид:");
        for (int x : nums) {
            System.out.print(x + " ");
        }

        //поиск минимального элемента массива
        System.out.println();
        //        for (int i = 0; i < nums.length; i++) {
        //           min = nums[i];
        //          for (int j = 0; j < nums.length; j++) {
        //               if (min > nums[j]) {
        //                  min = nums[j];
        //              }
        //          }
        //      }
        //цикл for-each
        for (int x : nums)
            min = x;
        for (int y : nums)
            if (min > y) {
                min = y;
            }
        System.out.println("Минимальный элемент массива min=" + min);

        //поиск максимального элемента массива
//        for (int x : nums) {
//            max = x;
//            for (int z : nums) {
//                if (max < z) {
//                    max = z;
//                }
//            }
//        }
        min = max = nums[0];
        // for-each
        for (int v : nums) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        System.out.println("Максимальный элемент массива max=" + max);
        System.out.println("Минимальный элемент массива min=" + min);

        //сумма элементов массива
        for (int x : nums) {
            sum = sum + x;
        }
        System.out.println("Сумма элементов массива равна=" + sum);
    }
}

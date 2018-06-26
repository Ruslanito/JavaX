package com.ruslanito.Tutorials.GolovachIvan.JavaCore;

import java.util.Arrays;

/**
 * Created by Ruslanito on 08.02.2017.
 */
public class P1_5ArrayInvert {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int i, k, m;

		m = arr2.length;
		System.out.println("Количество элементов массива:");
		System.out.println("Массив №1 " + arr.length);
		System.out.println("Массив №2 " + arr2.length);
		for (i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.round(Math.random() * 100));
		}
		System.out.println();
		System.out.println("Исходные массивы имеют вид:");
		System.out.print(Arrays.toString(arr));
		System.out.println();
		System.out.print(Arrays.toString(arr2));

		for (k = 0, i = m - 1; k < m; k++) {
			arr2[k] = arr[i];
			i--;
		}
		System.out.println();
		System.out.println("Итоговые массивы имеют вид:");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}
}

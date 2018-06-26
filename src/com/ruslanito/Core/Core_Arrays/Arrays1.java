package com.ruslanito.Core.Core_Arrays;

/**
 * Created by user on 24.12.2016.
 */
public class Arrays1 {
	public static void main(String args[]) {
		int[] numbers = new int[5];
		numbers[0] = 10;
		System.out.println(numbers[0]);
		String[] strings = new String[3];
		strings[0] = " Hello ";
		strings[1] = " Bye-bye ";
		strings[2] = " )))) ";
		System.out.println(strings[0] + strings[1] + strings[2]);
		System.out.println();

		for (String x : strings) {
			System.out.println(x);
		}
		System.out.println();
		int[] numbers1 = { 2, 5, 7, 8, 10 };
		int sum = 0;
		for (int z : numbers1) {
			System.out.println(z);
			sum = sum + z;
		}
		System.out.println("сумма элементов массива =" + sum);

	}

}

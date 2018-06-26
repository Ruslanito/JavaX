package com.ruslanito.Core.Core_Exeption;

public class TryCatcn_CatchThrowable {
	public static void main(String[] args) {
		// create arrays
		int num1[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		int num2[] = { 2, 0, 4, 7, 0, 24 };
		// create for loop
		for (int i = 0; i < num1.length; i++) {
			try {
				System.out.println(num1[i] + "/" + num2[i] + "=" + num1[i] / num2[i]);
			} catch (ArrayIndexOutOfBoundsException exc) {
				System.out.println(" не найден элемент");
			} catch (Throwable exc) {
					System.out.println("есть исключение!");
			}
		}
	}

}

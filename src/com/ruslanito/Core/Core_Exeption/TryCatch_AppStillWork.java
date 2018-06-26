package com.ruslanito.Core.Core_Exeption;

public class TryCatch_AppStillWork {
	public static void main(String[] args) {
		// create arrays
		int num1[] = { 2, 4, 6, 8, 10, 12 };
		int num2[] = { 2, 0, 4, 7, 0, 24 };
		//create for loop
		for (int i = 0; i < num1.length; i++) {
			try {
				System.out.println(num1[i] + "/" + num2[i] + "=" + num1[i] / num2[i]);
			} catch (ArithmeticException exc) {
				System.out.println("попытка деления на 0");
			}
		}

	}

}

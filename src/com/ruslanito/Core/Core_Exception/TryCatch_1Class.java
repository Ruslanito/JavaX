package com.ruslanito.Core.Core_Exception;

public class TryCatch_1Class {
	public static void main(String[] args) {
		// create array num
		int num[] = new int[4];
		// create try-block
		try {
			System.out.println("Before exception:");
			// use outrange index
			num[5] = 10;
			System.out.println("******"+num[5]);
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Out of num array range!");
		}
		System.out.println("After Try_Catch block");

	}
}

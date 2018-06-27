package com.ruslanito.Core.Core_Exception;

public class TryCatch_Throw {

	public static void main(String[] args) {
		try{
			System.out.println("Before throw");
			throw new ArithmeticException();//generete exception
			}catch (ArithmeticException exc){
				System.out.println("exception was catched");
			}
		System.out.println("Outide try-catch block");
	}
}

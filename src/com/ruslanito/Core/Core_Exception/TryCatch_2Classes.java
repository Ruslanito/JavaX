package com.ruslanito.Core.Core_Exception;

class ExceptionTest {
	// create exception
	static void genException() {
		int nums[] = new int[5];
		int n = 7;
		System.out.println("***");
		nums [n] = 10;
		System.out.println("*"+nums[n]+"*");
	}
}

public class TryCatch_2Classes {
	public static void main(String[] args) {
		//create try-catcn block
		try{
			ExceptionTest.genException();
		}catch (Exception e){
			System.out.println("catch work!");
		}
		System.out.println("try-catch block ends!");
	}
}

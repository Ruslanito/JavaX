package com.ruslanito.Core.Core_Exeption;

public class TryCatch_2try2catch {

	public static void main(String[] args) {
		// create 2 arrays
		int num1[]={2,4,6,8,10,12};
		int num2[]={1,0,3,4};
		
		try {
			for (int i=0; i<num1.length; i++){
				try{
					System.out.println(num1[i]+"/"+num2[i]+"="+num1[i]/num2[i]);
					}catch(ArithmeticException exc){
						System.out.println("деление на 0");
					}
			}
		}
		catch (ArrayIndexOutOfBoundsException exc){
			System.out.println("No element");
			System.out.println("Fatal error!");
		}
	}
}
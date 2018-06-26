package com.ruslanito.Core_General;

public class ConvertCelsToFahr {

	public static void main(String[] args) {
//		int Celsium = 40;
//		double Fahrenheit;
//		Fahrenheit = convertCelsiumToFahrenheit(Celsium);
//		System.out.print(Fahrenheit);
		System.out.print(convertCelsiumToFahrenheit(40));
	}
	
	public static double convertCelsiumToFahrenheit(int Celsium){
		int a = 9;
		int s = 5;
		int d = 32;
//		double Fahrenheit;
//		Fahrenheit = (Celsium*a/s)+d;
//		return Fahrenheit;
		return ((Celsium*a/s)+d);
	}

}

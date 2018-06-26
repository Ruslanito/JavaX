package com.ruslanito.Core.Core_MethodsAndClasses;

public class TwoMethods_OneClass1 {
	final static String txt = "Это глобальная переменная класса TwoMethodsOneClassSimple";
	
	public static void main(String []args){
		String txt = "Это локальная переменная метода main";
		System.out.println(txt);
		sub();
		System.out.println(TwoMethods_OneClass1.txt);
	}
	public static void sub() { 
		String ttt = "Это локальная переменная метода sub";
		System.out.println(ttt);
	}
}
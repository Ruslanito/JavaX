package com.ruslanito.Core.Core_MethodsAndClasses;

public class TwoClasses1_1 {
	public static void main (String args[]){
		TwoClasses1_2 r = new TwoClasses1_2();
		r.Klava();
		r.i=count(r.i);
		r.k=count(r.k);
		r.z=count2(r.z);
		//r.a=r.a;
		System.out.println("Теперь певое число "+r.a+" = "+r.i);
		System.out.println("Теперь второе число = "+r.k);
		System.out.println("Теперь третье число = "+r.z);		
	}
	private static int count(int x){
		x=x+1;
		return x;
	}
	private static int count2(int y){
		y=y*5;
		return y;
	}
}
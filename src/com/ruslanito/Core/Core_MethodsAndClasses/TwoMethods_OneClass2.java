package com.ruslanito.Core.Core_MethodsAndClasses;

public class TwoMethods_OneClass2 {
	public static void main (String args[]){
		int i=5;
		int k=34;
		int z=29;
		i=10+count(i);
		k=count(k);
		z=count2(z);
		System.out.println(i);//16
		System.out.println(k);//35
		System.out.println(z);//145
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
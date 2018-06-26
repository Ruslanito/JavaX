package com.ruslanito.Core.Core_Math;

//Диапазоны
public class MathRanges {

	public static void main(String[] args) {
		System.out.println (Math.PI);
		System.out.println(Math.random());//[0;1)
		System.out.println(Math.random()+3);//[3;4)
		System.out.println(Math.random()-3);//[-3;-2)
		System.out.println(Math.random()*3);//[0;3)
		System.out.println(Math.random()*3+3);//[3;6)
		System.out.println(Math.random()*3-3);//[-3;0)
		System.out.println(Math.random()*6-3);//[-3;3)
		System.out.println((int)(Math.random()*6)+3);//[0;9)
		System.out.println((int)(Math.random()*6)-3);//[-3;3)
		int n=7;
		System.out.print((int)(Math.random()*2*n)-n);//[-7;7]
		
	}

}
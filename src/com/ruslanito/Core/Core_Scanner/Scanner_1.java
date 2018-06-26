package com.ruslanito.Core.Core_Scanner;

import java.util.Scanner;//ввод с клавиатуры
public class Scanner_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("¬ведите число 1:");
		int a=sc.nextInt();
		System.out.println("¬ведите число 2:");
		int b=sc.nextInt();
		sc.close();
		System.out.println("¬ведЄное число 1:"+a);
		System.out.println("¬ведЄное число 2:"+b);
		System.out.print("—умма чисел:"+(a+b));

	}

}
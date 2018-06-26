package com.ruslanito.Core.Core_IF;

import java.util.Scanner;//ввод с клавиатуры и условие выбора
public class IF_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("¬ведите число a:");
		int a=sc.nextInt();
		System.out.println("¬ведите число b:");
		int b=sc.nextInt();
		sc.close();
		int min;
		if (a<b){
			min=a;
			System.out.println("¬ведЄное число a меньше b:"+a);
		}
		if (a>b){
			min=b;
			System.out.println("¬ведЄное число b меньше a:"+b);
		}
		if(a==b){
			min=a=b;
			System.out.print("„исла равны");
		}
	}
	}

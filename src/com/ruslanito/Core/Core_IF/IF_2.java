package com.ruslanito.Core.Core_IF;

import java.util.Scanner;//ввод с клавиатуры  и условие выбора
public class IF_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("¬ведите число a:");
		int a=sc.nextInt();
				sc.close();
				if (a<0){
		System.out.println(a+"<0");
				}
				if (a>0){
		System.out.println(a+">0");
				}
				if (a==0){
		System.out.print(a+"a=0");
				}
	}
}


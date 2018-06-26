package com.ruslanito.Core.Core_IF;

import java.util.Scanner;
public class IF_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("¬ведите число a:");
		int a=sc.nextInt();
		System.out.println("¬ведите число b:");
		int b=sc.nextInt();
		sc.close();
		if (a==b){
			System.out.println("„исла равны");
		}
			else {
				System.out.println("„исла не равны");
		}
	}
}
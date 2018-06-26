package com.ruslanito.Core.Core_MethodsAndClasses;

import java.util.Scanner;
public class TwoClasses1_2 {
	int i;
	int k;
	int z;
	int a=10;
	public void Klava(){
		System.out.println("¬ведите первое число i=");
		Scanner scn = new Scanner(System.in);
		i=scn.nextInt();
		System.out.println("¬ведите второе чмсло k=");
		k=scn.nextInt();
		System.out.println("¬ведите третье число z=");
		z=scn.nextInt();
		scn.close();
	}
}
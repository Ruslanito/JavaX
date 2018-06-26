package com.ruslanito.MyProjects.Water.General;

import java.util.Scanner;

public class Water3{
	int a, n, k, m, vs, vsum;
		
	public static void main(String [] args){
		Water3 zz = new Water3();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Расчёт потребления воды.");
		System.out.println("Введите исходные данные:");
		System.out.println("Количество птичников:");
			  zz.a=1;
		//int a=sc.nextInt();//ввод количество птичников (a)
		//    	if(a>9||a<1){
		//			System.out.println("Такого птичника пока нет!");
		//		}
			System.out.println("Количество птицы в птичнике "+zz.a);
		//	zz.n=23000;
			zz.n=sc.nextInt();//  ввод количества птицы (n) в птичнике (а)
		//		if(n>45000||n<15000){
		//		System.out.println("Такое количество птицы в одном птичнике пока не может быть!");
			
			System.out.println("Введите значение кривой наклона");
			
		    zz.k=sc.nextInt();//  экспериментальное значение кривой наклона k=113
		//			if(k>120||k<105){
		//	System.out.println("Такое значения не может быть!");
		//		}
			System.out.println("Введите день посадки m");	
			
				zz.m=sc.nextInt();//ввод дня посадки (m)
				sc.close();
		//		
		//    	if(m>45||m<2){
		//			System.out.println("Такого дня посадки пока нет!");
		//		}
					int v;
						v=zz.n*zz.m*zz.k/10000;
			System.out.println("Объём потреблёной воды за "+zz.m+"-й день в птичнике "+zz.a+" в литрах "+v);
			
				zz.vs=0;//объём с 0-го дня
				int x;
				zz.vsum=0;//объём воды за день m
				for (x=1; x<=zz.m; x++){
					System.out.println(zz.m+"-"+x);
					zz.vs=zz.vs+(zz.k*x*zz.n/10000);
					zz.vsum=(zz.k*x*zz.n/10000);
					System.out.println("Общий объём потреблёной воды c 0-го дня по день "+(x-1)+" равен в литрах "+zz.vs+" в т.ч. за последний день "+zz.vsum);
						}
			}	
}


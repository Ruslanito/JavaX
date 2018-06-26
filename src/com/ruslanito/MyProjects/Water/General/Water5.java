package com.ruslanito.MyProjects.Water.General;
//Потребление воды за день и суммарно в виде массива
import java.util.Scanner;

public class Water5 {
	
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Расчёт потребления воды.");
		System.out.println("Введите исходные данные:");
		//System.out.println("Количество птичников:");
			int a=1;
		//int a=sc.nextInt();//ввод количество птичников (a)
		//		if(a>9||a<1){
		//			System.out.println("Такого птичника пока нет!");
		//		}
			System.out.println("Количество птицы в птичнике "+a);
		//	int n=23000;
			int n=sc.nextInt();//  ввод количества птицы (n) в птичнике (а)
				if(n>45000||n<15000){
					System.out.println("Такое количество птицы в одном птичнике пока не может быть!");
				}
		//	System.out.println("Введите значение кривой наклона");
			int k=113;
		//int k=sc.nextInt();//  экспериментальное значение кривой наклона k=113
					if(k>120||k<105){
			System.out.println("Такое значения не может быть!");
				}
			System.out.println("Введите день посадки m");		
				int m=sc.nextInt();//ввод дня посадки (m)
				sc.close();
					if(m>45||m<2){
					System.out.println("Такого дня посадки пока нет!");
					}
		
					int v=k*m*n/10000;//проверочная формула объёма за 1 день
							System.out.println("Объём потреблёной воды за "+m+"-й день в птичнике "+a+" в литрах "+v);
			
					System.out.println("");
							int [] watArr1 = new int[m];// массив дня посадки 
							for (int i=0; i<m; i++){
							watArr1[i] = i;
							System.out.print(watArr1[i]+"  ");
					}		
					System.out.println("");
						int [] watArr = new int[m];// потребление воды за 1 день в виде однорядного массива
						for (int i=0; i<m; i++){
							watArr[i] = ((k*(i+1)*n)/10000);
							System.out.print(watArr[i]+"  ");
					}
					
					System.out.println("");
						int sum=0; //потребление воды с 0-го дня 
						int[] watArr2 = new int[m];
						for (int i=0; i<m; i++){
							sum =sum+ ((k*(i+1)*n)/10000);
							watArr2[i]=sum;
							System.out.print(watArr2[i]+"  ");
					}
					System.out.println("");// 3 массива в столбик (вертикаль)
					System.out.println("");
						for(int i=0; i<m; i++){
							System.out.print(watArr1[i]+"-"+watArr[i] + "-" + watArr2[i]);
							System.out.println();
							
					}
			}
	}
	
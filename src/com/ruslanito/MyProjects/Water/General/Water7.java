package com.ruslanito.MyProjects.Water.General;

import java.util.Scanner;

public class Water7 {
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		
		System.out.println("Общее количество птичников:");
		int b=sc.nextInt();//ввод общего количество птичников (b)
		
		System.out.println("Количество птичников с птицей (от 1 до 7):");
		int n1, n2, n3, n4, n5, n6, n7;// количество птицы посаженой
		int m0, m1, m2, m3, m4, m5, m6, m7, mg;//день посадки
		int a=sc.nextInt();//ввод количество птичников с птицей (a)
			
		if (a==1){
			System.out.println("Количество птицы сидящей в птичнике 1");
			n1=sc.nextInt();
			n2=0; n3=0; n4=0; n5=0; n6=0; n7=0;
			System.out.println("Посажен только "+a+" птичник");
			System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			System.out.println("");
			int[] watArrN = {n1, n2, n3, n4, n5, n6, n7};
			  for (int t:watArrN){
			  System.out.println(t);
			  }
			  
		}
		
		else if(a==2){
			System.out.println("Количество птицы сидящей в птичнике 1");
			n1=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 2");
			n2=sc.nextInt();
			n3=0; n4=0; n5=0; n6=0; n7=0;
			System.out.println("Посажено только "+a+" птичника");
			System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			System.out.println("");
			int[] watArrN = {n1, n2, n3, n4, n5, n6, n7};
			  for (int t:watArrN){
			  System.out.println(t);
			  }
		}
		else if(a==3){
			System.out.println("Количество птицы сидящей в птичнике 1");
			n1=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 2");
			n2=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 3");
			n3=sc.nextInt();
			n4=0; n5=0; n6=0; n7=0;
			System.out.println("Посажено только "+a+" птичника");
			System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			System.out.println("");
			int[] watArrN = {n1, n2, n3, n4, n5, n6, n7};
			  for (int t:watArrN){
			  System.out.println(t);
			  }
		}
		else if(a==4){
			System.out.println("Количество птицы сидящей в птичнике 1");
			n1=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 2");
			n2=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 3");
			n3=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 4");
			n4=sc.nextInt();
			n5=0; n6=0; n7=0;
			System.out.println("Посажено только "+a+" птичника");
			System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			System.out.println("");
			int[] watArrN = {n1, n2, n3, n4, n5, n6, n7};
			  for (int t:watArrN){
			  System.out.println(t);
			  }
		}
		else if(a==5){
			System.out.println("Количество птицы сидящей в птичнике 1");
			n1=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 2");
			n2=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 3");
			n3=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 4");
			n4=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 5");
			n5=sc.nextInt();
			n6=0; n7=0;
			System.out.println("Посажено  "+a+" птичников");
			System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			System.out.println("");
			int[] watArrN = {n1, n2, n3, n4, n5, n6, n7};
			  for (int t:watArrN){
			  System.out.println(t);
			  }
		}
		else if(a==6){
			System.out.println("Количество птицы сидящей в птичнике 1");
			n1=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 2");
			n2=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 3");
			n3=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 4");
			n4=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 5");
			n5=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 6");
			n6=sc.nextInt();
			n7=0;
			System.out.println("Посажено только "+a+" птичников");
			System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			System.out.println("");
			int[] watArrN = {n1, n2, n3, n4, n5, n6, n7};
			  for (int t:watArrN){
			  System.out.println(t);
			  					 }
		}
		else if(a==7){
				System.out.println("Количество птицы сидящей в птичнике 1");
			n1=sc.nextInt();
				System.out.println("Количество птицы сидящей в птичнике 2");
			n2=sc.nextInt();
				System.out.println("Количество птицы сидящей в птичнике 3");
			n3=sc.nextInt();
				System.out.println("Количество птицы сидящей в птичнике 4");
			n4=sc.nextInt();
				System.out.println("Количество птицы сидящей в птичнике 5");
			n5=sc.nextInt();
				System.out.println("Количество птицы сидящей в птичнике 6");
			n6=sc.nextInt();
				System.out.println("Количество птицы сидящей в птичнике 7");
			n7=sc.nextInt();
				System.out.println("Посажено все "+a+" птичников");
				System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
				System.out.println("");
			int[] watArrN = {n1, n2, n3, n4, n5, n6, n7};
			  for (int t:watArrN){
				  System.out.println(t);
			  					 }	
					}
				System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");	
		
				System.out.println("");
				System.out.println("День посадки в птичнике №1");
			m0=sc.nextInt();
			m1=m0;
			int [] watArrM1 = new int[m1];// массив дня посадки цеха №1
			for (int i=0; i<m1; i++){
			watArrM1[i] = i;
				System.out.print(watArrM1[i]+"  ");
									}
				m2=m0+7;
				m3=m0+14;
				m4=m0+21;
				m5=m0+28;
				m6=m0+35;
				m7=m0+42;
				int[] watArrM = {m1, m2, m3, m4, m5, m6, m7};//массив дня посадки для всех цехов
				 for (int t:watArrM){
					  System.out.print(t);
					  				}
				 
				  //int[][]watArrMG=new int [49][8]; (7 цехов по 49 дней)
				  int watArrMG [][]={  //Общий массив цикла выращивания по дням 49-ти дневного цикла
						  {0,1,0,36,29,22,15,8},
						  {1,2,0,37,30,23,16,9},
						  {2,3,0,38,31,24,17,10},
						  {3,4,0,39,32,25,18,11},
						  {4,5,0,40,33,26,19,12},
						  {5,6,0,41,34,27,20,13},
						  {6,7,0,42,35,28,21,14},
						  {7,8,1,0,36,29,22,15},
						  {8,9,2,0,37,30,23,16},
						  {9,10,3,0,38,31,24,17},
						  {10,11,4,0,39,32,25,18},
						  {11,12,5,0,40,33,26,19},
						  {12,13,6,0,41,34,27,20},
						  {13,14,7,0,42,35,28,21},
						  {14,15,8,1,0,36,29,22},
						  {15,16,9,2,0,37,30,23},
						  {16,17,10,3,0,38,31,24},
						  {17,18,11,4,0,39,32,25},
						  {18,19,12,5,0,40,33,26},
						  {19,20,13,6,0,41,34,27},
						  {20,21,14,7,0,42,35,28},
						  {21,22,15,8,1,0,36,29},
						  {22,23,16,9,2,0,37,30},
						  {23,24,17,10,3,0,38,31},
						  {24,25,18,11,4,0,39,32},
						  {25,26,19,12,5,0,40,33},
						  {26,27,20,13,6,0,41,34},
						  {27,28,21,14,7,0,42,35},
						  {28,29,22,15,8,1,0,36},
						  {29,30,23,16,9,2,0,37},
						  {30,31,24,17,10,3,0,38},
						  {31,32,25,18,11,4,0,39},
						  {32,33,26,19,12,5,0,40},
						  {33,34,27,20,13,6,0,41},
						  {34,35,28,21,14,7,0,42},
						  {35,36,29,22,15,8,1,0},
						  {36,37,30,23,16,9,2,0},
						  {37,38,31,24,17,10,3,0},
						  {38,39,32,25,18,11,4,0},
						  {39,40,33,26,19,12,5,0},
						  {40,41,34,27,20,13,6,0},
						  {41,42,35,28,21,14,7,0},
						  {42,0,36,29,22,15,8,1},
						  {43,0,37,30,23,16,9,2},
						  {44,0,38,31,24,17,10,3},
						  {45,0,39,32,25,18,11,4},
						  {46,0,40,33,26,19,12,5},
						  {47,0,41,34,27,20,13,6},
						  {48,0,42,35,28,21,14,7},
				  					};
				  
				  			System.out.println("");
				  			System.out.println("+-+-+-+-+-+");
				  			System.out.println("Введите нужный день общего цикла выращивания");
					mg=sc.nextInt();
							System.out.println(watArrMG [mg][0]+"-"+watArrMG [mg][1]+"-"+watArrMG [mg][2]+"-"+watArrMG [mg][3]+"-"
							+watArrMG [mg][4]+"-"+watArrMG [mg][5]+"-"+watArrMG [mg][6]+"-"+watArrMG [mg][7]);
					for (int i=0; i<=7; i++){
						watArrMG [mg][i]=watArrMG [mg][i];
							System.out.print(watArrMG [mg][i]+"*");
											}
					
					
				 	
				 
				 
				 
			
			sc.close();
//	System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
	System.out.println("");
	System.out.println("*********************************************************************");
		//	int[] watArrN = {n1, n2, n3, n4, n5, n6, n7};
		//	  for (int t:watArrN){
		//	  System.out.println(t);
		//    }
	
				
	}
}
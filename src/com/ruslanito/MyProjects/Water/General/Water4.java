package com.ruslanito.MyProjects.Water.General;
import java.util.Scanner;

public class Water4 {
	
	static int c=99;
	static int  b;
	static Scanner sc=new Scanner(System.in);
	
	static int a;// количество цехов посажено a, всего цехов b и количество птицы посаженой n
	static int n1;
	static int n2;
	static int n3;
	static int n4;
	static int n5;
	static int n6;
	static int n7;
	static int [] watArrA ={1, 2, 3, 4, 5, 6, 7};// массив количества птичников
	static int [] watArrN = {n1, n2, n3, n4, n5, n6, n7};//массив количества птицы в птичниках
	
	public static void main(String [] args){
			
			System.out.println("Введите общее количество птичников");
				b=sc.nextInt();//ввод общего количество птичников (b)
	
			System.out.println("Количество птичников с посаженной птицей(от 1 до 7):");
				a=sc.nextInt();//ввод количество птичников (a)
				
			
				
	if (a==1){
			System.out.println("Количество птицы сидящей в птичнике 1");
			Water4.n1=sc.nextInt();
			Water4.n2=0; Water4.n3=0; Water4.n4=0; Water4.n5=0; Water4.n6=0; Water4.n7=0;
			System.out.println("Посажен только "+a+" птичник из "+b);
			//System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			
			//  for (int t:watArrN){
			// System.out.println(t);
			  	
				for(int y=0; y<=b; y++){
					System.out.println("Птичник №"+watArrA[y]+" - "+watArrN[y]+" голов");
				    //System.out.println();
					System.out.println(Water4.b+"-"+Water4.a+"-"+n1+"*"+n2+"*"+n3+"*"+n4+"*"+n5+"*"+n6+"*"+n7);
					
/*					for(int t:watArrN){
						System.out.print(t);
					}
					System.out.println("");
					for(int t:watArrA){
						System.out.print(t);
					}
*/					
					}
			
			}
	
	  else if(a==2){
			System.out.println("Количество птицы сидящей в птичнике 1");
			n1=sc.nextInt();
			System.out.println("Количество птицы сидящей в птичнике 2");
			n2=sc.nextInt();
			n3=0; n4=0; n5=0; n6=0; n7=0;
			System.out.println("Посажено только "+a+" птичника из "+b);
			//System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			
			//  for (int t:watArrN){
			//  System.out.println(t);
			
				for(int y=0; y<=b; y++){
					System.out.println("Птичник №"+watArrA[y]+" - "+watArrN[y]+" голов");
					//System.out.println();
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
			System.out.println("Посажено только "+a+" птичника из "+b);
			//System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			
			//  for (int t:watArrN){
			//  System.out.println(t);
			
				for(int y=0; y<=b; y++){
					System.out.println("Птичник №"+watArrA[y]+" - "+watArrN[y]+" голов");
					//System.out.println();
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
			System.out.println("Посажено только "+a+" птичника из "+b);
			//System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			
			 // for (int t:watArrN){
			 // System.out.println(t);
			
				for(int y=0; y<=b; y++){
					System.out.println("Птичник №"+watArrA[y]+" - "+watArrN[y]+" голов");
				//System.out.println();
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
			System.out.println("Посажено  "+a+" птичников из "+b);
			//System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			
			 // for (int t:watArrN){
			 // System.out.println(t);
			
			   	for(int y=0; y<=b; y++){
			   		System.out.println("Птичник №"+watArrA[y]+" - "+watArrN[y]+" голов");
				//System.out.println();
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
			System.out.println("Посажено только "+a+" птичников из "+b);
			  //System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			
			  //for (int t:watArrN){
			  //System.out.println(t);
			
				for(int y=0; y<=b; y++){
					System.out.println("Птичник №"+watArrA[y]+" - "+watArrN[y]+" голов");
				//System.out.println();
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
			System.out.println("Посажено все "+a+" птичников из "+b);
			//System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
			
			 // for (int t:watArrN){
			 // System.out.println(t);
			
				for(int y=0; y<=b; y++){
					System.out.println("Птичник №"+watArrA[y]+" - "+watArrN[y]+" голов");
				//System.out.println();
				}
	  		}
//	sc.close();
//	System.out.print(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7);
	System.out.println("*********************************************************************");
		//	int[] watArrN = {n1, n2, n3, n4, n5, n6, n7};
		//	  for (int t:watArrN){
		//	  System.out.println(t);
		//    }
	}	
}

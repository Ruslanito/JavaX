package com.ruslanito.MyProjects.Water.General;

//import java.util.Scanner;

public class Water6{
	int a;//параметры
	static int n;//количество птицы
	static int k;//коэфициент кривой
	static int m;//день посадки
	int vs;//объЄм потреблени¤ за период
	int vsum;//объЄм потреблени¤ за 1 день
	
	void volume(){
		vs=0;
		int x;
			for (x=1; x<=m; x++){
			System.out.println(m+"-"+x);
			vs=vs+(k*x*n/10000);
			vsum=(k*x*n/10000);
			
			System.out.println("ќбъЄм потреблЄной воды за "+x+"-й день в птичнике "+a+" в литрах "+vsum);
			System.out.println("ќбщий объЄм потреблЄной воды с 0-го дн¤ по день "+x+" в птичнике "+a+" в литрах "+vs);
			}
		}
	
	void volArray(){
		System.out.println("");
		int [] watArr = new int[m];// потребление воды за 1 день в виде однор¤дного массива
		for (int i=0; i<m; i++){
			watArr[i] = ((k*(i+1)*n)/10000);
			System.out.print(watArr[i]+"  ");
					}
	}
	
	void volArrayA(){// массив количества цехов
		System.out.println("");
		int [] watArrA = new int[a];
		for (int i=0; i<a; i++){
			watArrA [i] = i+1;
			System.out.print(watArrA[i]+" ");
		}
	}
	
	 void dayC(){
		System.out.println("");
		int [] watArrM = new int[m];
		for (int i=0; i<m; i++){
			watArrM [i] = i+1;
			System.out.print(watArrM[i]+" ");
		}
	}
	
	public static void main(String args[]){
		Water6 br1 = new Water6();
		Water6 br2 = new Water6();
		Water6 br3 = br1;
/*		WaterCounter3 br4 = br1;
		WaterCounter3 br5 = br1;
		WaterCounter3 br6 = br1;
		WaterCounter3 br7 = br1;
		WaterCounter3 br8 = br1;
		WaterCounter3 br9 = br1;
*/	
		System.out.println("");
		System.out.println("÷ех є1");
		br1.a=1;
		br1.n=23000;
		br1.m=20;
		br1.k=113;
		//br1.volume();
		br1.volArray();
		br1.volArrayA();
		br1.dayC();
		System.out.println("");
	
		System.out.println("");
		System.out.println("÷ех є2");
		br2.a=2;
		br2.n=23000;
		br2.m=13;
		br2.k=113;
		//br2.volume();
		br2.volArray();
		br2.volArrayA();
		br2.dayC();
		System.out.println("");
		
		System.out.println("");
		System.out.println("÷ех є3");
		br3.a=3;
		br3.n=23000;
		br3.m=6;
		br3.k=113;
		//br3.volume();
		br3.volArray();
		br3.volArrayA();
		br3.dayC();
		System.out.println("");
		
		}
}

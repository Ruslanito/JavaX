package com.ruslanito.Core_General;

public class Number19 {
	 public static void main(String[] args) {
	        int x = 1;
	        int y = 0;

	        y = y + x; //11(30),13(15),
	        System.out.println("1- "+"y"+y+" x"+x);
	     
	        x = x * 2; //1(16),2(15),12(9),13(15),
	        y = y + x; //2(15),
	        System.out.println("2- "+"y"+y+" x"+x);
	        
	        x = x * 2; //3(17),4(15),12(9),
	 //       y = y + x; //4(15),
	        System.out.println("3- "+"y"+y+" x"+x);

	        x = x * 2; //5(19),7(23),
	//        y = y + x; //6(23),7(23),
	        System.out.println("4- "+"y"+y+" x"+x);

	        x = x * 2; //8(23),10(15),
	        y = y + x; //9(15),10(15),
	        System.out.println("5- "+"y"+y+" x"+x);

	        System.out.println(y);
	    }
}

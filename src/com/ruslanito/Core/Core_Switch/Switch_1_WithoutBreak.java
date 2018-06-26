package com.ruslanito.Core.Core_Switch;

public class Switch_1_WithoutBreak {
	public static void main(String[] args) {
		for (int i=0; i<6; i++){
			switch(i){
			case 0: System.out.println("i равно 0");
			
			case 1: System.out.println("i равно 1");
			
			case 2: System.out.println("i равно 2");
			
			case 3: System.out.println ("i равно 3");
			
			default: System.out.println ("i больше 3");
			}
		}
	}

}

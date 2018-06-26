package com.ruslanito.Core.Core_Exeption;

public class TryCatch_Throws {

	public static char prompt(String str)
	throws java.io.IOException{
		System.out.println(str+":");
		return (char) System.in.read();
	}
	
	public static void main(String[] args) {
		char ch;
		try{
			ch = prompt ("Enter a letter");
		}catch(java.io.IOException exc){
			System.out.println(" IO exception!");
			ch='X';
		}
		System.out.println("You press key "+ch);
	}

}

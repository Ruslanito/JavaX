package com.ruslanito.Core.Core_Arrays;

public class Multidimensional_Arrays4{
	public static void main (String[] args){
		int[]j={1,2,3,4,5,6,7,8};
		int[]g={8,7,6,5,4,3,2,1};
		int l =j.length;
		int i;
		System.out.println(l);
		
		for(i=0; i<l; i++){
		System.out.print(j[i] + "  " + g[i]);
		System.out.println("");
		}
	}
}
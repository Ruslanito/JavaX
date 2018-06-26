package com.ruslanito.Core.Core_Math;

import javax.swing.JOptionPane;
public class ChetOrNeChet {
	public static void main(String[] args){
		int n;
		String n1; 
		n1=JOptionPane.showInputDialog("¬ведите целое число");
		n=Integer.parseInt(n1);
		Double i=(double)2;
		Double k=(double)(n/i);
		System.out.println("k="+k);
		double k1=Math.round(k);
		System.out.println("k1="+k1);
		if ((k-k1)==0){
			JOptionPane.showMessageDialog(null, "„исло "+n+" чЄтное");
					}
		else{
			JOptionPane.showMessageDialog(null, "„исло "+n+" нечЄтное");
		}
	}
}

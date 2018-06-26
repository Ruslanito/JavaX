package com.ruslanito.Core.Core_Swing;

import javax.swing.JOptionPane;//ввод с окон и условие выбора
public class JFrame_Window {
		public static void main(String[] args) {
		int a,b;
		String c, d;
				c = JOptionPane.showInputDialog("¬ведите число a");
				d = JOptionPane.showInputDialog("¬ведите число b");
						a = Integer.parseInt(c);
						b = Integer.parseInt(d);
		int min;
		if (a<b){
			min=a;
			JOptionPane.showMessageDialog(null, "¬ведЄное число a меньше b:"+a);
			//System.out.println("¬ведЄное число a меньше b:"+a);
		}
		if (a>b){
			min=b;
			JOptionPane.showMessageDialog(null, "¬ведЄное число b меньше a:"+b);
			//System.out.println("¬ведЄное число b меньше a:"+b);
		}
		if(a==b){
			min=a=b;
			JOptionPane.showMessageDialog(null, "„исла равны");
			//System.out.println("¬ведЄные числа a и b  равны");
		}
	}
	}
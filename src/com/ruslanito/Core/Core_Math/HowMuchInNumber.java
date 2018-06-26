package com.ruslanito.Core.Core_Math;

//сколько чисел в числе
import javax.swing.JOptionPane;
public class HowMuchInNumber {
	public static void main (String[] args){
		int m;
		String m1;
		m1=JOptionPane.showInputDialog("введите целое число от 1 до 9999");
		m=Integer.parseInt(m1);
		if (m<9){
			JOptionPane.showMessageDialog(null, "число "+m+" из одного числа");
				}
		else if (m<99){
			JOptionPane.showMessageDialog(null, "число "+m+" из двух числа");
				}
		else if (m<999){
			JOptionPane.showMessageDialog(null, "число "+m+" из трЄх числа");
				}
		else if (m<9999){
			JOptionPane.showMessageDialog(null, "число "+m+" из четырЄх числа");
				}
		{
			JOptionPane.showMessageDialog(null, "число "+m+" больше 9999");
		}
	}
}

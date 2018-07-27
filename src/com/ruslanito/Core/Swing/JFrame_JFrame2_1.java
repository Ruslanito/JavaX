package com.ruslanito.Core.Swing;

import javax.swing.JFrame;

public class JFrame_JFrame2_1 {
	public static void main (String args[]){
		JFrame_JFrame2_2 r = new JFrame_JFrame2_2("Дорога");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300,200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
	}
}

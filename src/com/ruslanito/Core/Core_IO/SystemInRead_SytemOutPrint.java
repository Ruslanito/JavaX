package com.ruslanito.Core.Core_IO;

import java.io.*;

public class SystemInRead_SytemOutPrint {

	public static void main(String[] args) {
			byte data[] = new byte[10];
			System.out.println("Введи символы:");
			try {
				System.in.read(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.print("Вы ввели: ");
			for(int i=0; i<data.length;i++)
				System.out.print((char) data[i]);
	}

}
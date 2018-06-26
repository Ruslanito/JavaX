package com.ruslanito.Core.Core_IO;

import java.io.*;

public class BufferedWriter3 {

	public static void main(String[] args) {
		// создаём файл bufferedwriter3.txt
		File myFile = new File("e://bufferedwriter3.txt");

		try {
			// используем ссылку на файл
			BufferedWriter writer = new BufferedWriter(new FileWriter(myFile));
			// запись информационной строки
			writer.write("Helo BufferedWriter3 ");  
			// Очистим поток
			writer.flush();
			// закрываем поток
			writer.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
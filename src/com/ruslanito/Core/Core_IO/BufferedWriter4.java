package com.ruslanito.Core.Core_IO;

import java.io.*;

public class BufferedWriter4 {

	public static void main(String[] args) {
		// создаём файл bufferedwriter4.txt с дополнением текста в нём
		File myFile = new File("e://bufferedwriter4.txt");

		try {
			// используем ссылку на файл
			BufferedWriter writer = new BufferedWriter(new FileWriter(myFile, true));
			// запись информационной строки
			writer.write("Helo BufferedWriter4 \n");
			// Очистим поток
			writer.flush();
			// закрываем поток
			writer.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
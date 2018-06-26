package com.ruslanito.Core.Core_IO;

import java.io.*;

public class FileWriter2 {

	public static void main(String[] args) {
		// создаём файл filewriter2.txt
		File myFile = new File("e://filewriter2.txt");

		try {
			// используем ссылку на файл
			FileWriter writer = new FileWriter(myFile);
			// запись информационной строки
			writer.write("Helo FileWriter2 ");
			// закрываем поток
			writer.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
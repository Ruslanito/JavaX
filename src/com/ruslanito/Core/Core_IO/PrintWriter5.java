package com.ruslanito.Core.Core_IO;

import java.io.*;

public class PrintWriter5 {

	public static void main(String[] args) {
		// создаём файл printwriter5.txt с дополнением текста в нём
		File myFile = new File("e://printwriter5.txt");

		try {
			// используем ссылку на файл
			PrintWriter writer = new PrintWriter (new BufferedWriter(new FileWriter(myFile, true)));
			// запись информационной строки
			writer.println("Helo PrintWriter5");
			// Очистим поток
			writer.flush();
			// закрываем поток
			writer.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
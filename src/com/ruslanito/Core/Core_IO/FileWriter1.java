package com.ruslanito.Core.Core_IO;

import java.io.*;

public class FileWriter1 {

	public static void main(String[] args) {
		try {
			// создаём файл filewriter.txt
			FileWriter writer = new FileWriter("e://filewriter.txt");
			// запись информационной строки
			writer.write("Helo FileWriter ");
			// закрываем поток
			writer.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

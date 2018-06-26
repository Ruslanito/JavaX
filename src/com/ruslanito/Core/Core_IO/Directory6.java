package com.ruslanito.Core.Core_IO;

import java.io.*;

public class Directory6 {

	public static void main(String[] args) throws IOException {

		// создаём директорию MyDirectory
		File myDir = new File("e://MyDirectory");
		myDir.mkdir();
		// создаём файл directory6.txt с дополнением текста в нём
		File myFile = new File("e://MyDirectory/directory6.txt");
		// получение абсолютной ссылки на файл
		String path = myDir.getAbsolutePath();
		System.out.println("Путь к директории  " + path);
		// создаём файлы в директории MyDirectory
		File one = new File(path + "/one.txt");
		one.getParentFile().mkdir();
		one.createNewFile();

		File two = new File(path + "/two.txt ");
		two.createNewFile();

		// вывод содержимого директроии на консоль
		System.out.println("Содержимое директории:");
		if (myDir.isDirectory()) {
			String[] dirContent = myDir.list();
			for (int i = 0; i < dirContent.length; i++) {
				System.out.println(dirContent[i]);
			}
		}

		try {
			// используем ссылку на файл
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
			// запись информационной строки
			writer.println("Helo Directory6");
			// Очистим поток
			writer.flush();
			// закрываем поток
			writer.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
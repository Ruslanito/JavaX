package com.ruslanito.Tutorials.Javabegin.FastJava.Camry.Start;

import com.ruslanito.Tutorials.Javabegin.FastJava.Camry.Object.Camry30;
import com.ruslanito.Tutorials.Javabegin.FastJava.Camry.Object.Camry50;

public class Main {

	public static void main(String[] args) {
		Camry50 camry50 = new Camry50();
		Camry30 camry30 = new Camry30();

		camry30.drive();
		camry30.stop();
		camry50.drive();
		camry50.stop();
		camry50.esp();
		camry50.stop1();

	}

}

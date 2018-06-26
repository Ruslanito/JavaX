package com.ruslanito.Tutorials.Javabegin.FastJava.Camry.Object;

public class Camry50 extends Camry30 {
	public void esp() {
		System.out.println("Camry50 esp works");
	}

	@Override
	public void drive() {
		System.out.println("Camry50 is running");
	}

	@Override
	public void stop() {
		System.out.println("Camry50 stopped");
	}

	public void stop1() {
		super.stop();
		System.out.println("Camry50 again stopped");
	}

}

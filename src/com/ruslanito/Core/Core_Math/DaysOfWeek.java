package com.ruslanito.Core.Core_Math;

public class DaysOfWeek {

	public static void main(String[] args) {
		int week=(int)(Math.random()*7+1);
		String k=week<6? "Рабочий день.":"Выходной день.";
		System.out.print("Сегодня"+week +".");
		System. out.print("Число"+k);
	}
}

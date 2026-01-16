package com.perezcasallas;

public class DaysRunner {

	public static void main(String[] args) {
		Day days = new Day("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado");
		String dayLongest = days.getLongestString();
		System.out.println("Longest String Days is: " + dayLongest);
		days.printDaysBackwards();
	}
}

package com.perezcasallas;

public class Day {
	private String[] days;

	public Day(String... days) {
		this.days = days;
	}

	public String getLongestString() {
		int longitud = 0;
		String dayLongest = "Hola";
		for (int i = 0; i < days.length; i++) {
			if (days[i].length() > longitud) {
				longitud = days[i].length();
				dayLongest = days[i];
			}
		}
		return dayLongest;
	}

	void printDaysBackwards() {
		for (int i = days.length - 1; i >= 0; i--) {
			System.out.println(days[i]);
		}
	}
}

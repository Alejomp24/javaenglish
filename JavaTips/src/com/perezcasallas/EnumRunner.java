package com.perezcasallas;

import java.util.Arrays;

enum Season {
	SUMMER(1), WINTER(2), FALL(3), SPRING(4);

	private int value;

	private Season(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}

public class EnumRunner {

	public static void main(String[] args) {
		Season season = Season.WINTER;
		Season season1 = Season.valueOf("WINTER"); // Imprimir un valor
		System.out.println(season1);
		System.out.println(Season.SPRING.ordinal()); // Saber en que posición está
		System.out.println(Season.SUMMER.getValue()); // Saber en que posición está
		System.out.println(Arrays.toString(Season.values())); // Imprimir toda la matriz
	}

}

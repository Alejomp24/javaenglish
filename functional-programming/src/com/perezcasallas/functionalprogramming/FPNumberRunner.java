package com.perezcasallas.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		int sum = numbers.stream().filter(number -> number % 2 == 0).reduce(0,
				(number1, number2) -> number1 + number2); // Cuando hay más de 1 parametro se debe usar (). ej
															// (number1,number2
		System.out.println(sum);
	}
}

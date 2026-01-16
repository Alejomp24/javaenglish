package com.perezcasallas;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {
	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}
	public static void main(String[] args) {
		List<Integer> numbers = List.of(24, 7, 12, 87, 89, 22);
		// Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
		// numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);
	}
}

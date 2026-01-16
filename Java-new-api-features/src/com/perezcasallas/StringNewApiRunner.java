package com.perezcasallas;

public class StringNewApiRunner {
	public static void main(String[] args) {
		System.out.println("  ".isBlank());
		System.out.println(" LR ".strip().replace(" ", "@"));
		System.out.println(" LR ".stripLeading().replace(" ", "@"));
		System.out.println(" LR ".stripTrailing().replace(" ", "@"));
		"Alejo\nYolis\nEliam\nPérez\nMuñoz".lines().forEach(System.out::println);

		System.out.println("UPPER".transform(s -> s.substring(2)));
		System.out.println("My name is $s. My age is %d.".formatted("Mario", 36));
	}
}

package com.perezcasallas;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = { 7, 12, 20, 24 };
			int number = numbers[5];
		}
	}
}

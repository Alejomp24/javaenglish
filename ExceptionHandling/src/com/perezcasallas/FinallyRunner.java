package com.perezcasallas;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
		int[] numbers = { 7, 12, 20, 24 };
		int number = numbers[5];
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		System.out.println("Before Scanner Close");
		scanner.close();
	}
	System.out.println("Justing before closing out main");
	}
}

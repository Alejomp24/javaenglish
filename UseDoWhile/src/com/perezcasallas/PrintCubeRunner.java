package com.perezcasallas;

import java.util.Scanner;

public class PrintCubeRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		do {
			if (n >= 0) {
				System.out.println("Cube is: " + n * n * n);
			}
			System.out.println("Enter a number: ");
			n = scanner.nextInt();
		} while (n >= 0);
		System.out.println("Thank You! Have Fun!");
	}
}
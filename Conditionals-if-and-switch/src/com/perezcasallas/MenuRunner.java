package com.perezcasallas;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter Number 2: ");
		int number2 = scanner.nextInt();
		System.out.println("Choices Available are:");
		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.print("Enter Option: ");
		int option = scanner.nextInt();

		int result = 0;
		switch (option) {
		case 1: // Add
			result = number1 + number2;
			break;
		case 2: // Subtract
			result = number1 - number2;
			break;
		case 3: // Divide
			result = number1 / number2;
			break;
		case 4: // Multiply
			result = number1 * number2;
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}
		System.out.println("Result is: " + result);
	}
}

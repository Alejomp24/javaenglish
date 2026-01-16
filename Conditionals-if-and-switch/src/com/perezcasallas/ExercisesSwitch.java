package com.perezcasallas;

import java.util.Scanner;

public class ExercisesSwitch {
	public static void main(String[] args) {
		// Return if the day is a Week Day
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of the day:");
		System.out.println("0 - Sunday");
		System.out.println("1 - Monday");
		System.out.println("2 - Tuesday");
		System.out.println("3 - Wednesday");
		System.out.println("4 - Thursday");
		System.out.println("5 - Friday");
		System.out.println("6 - Saturday");
		System.out.print("Enter a day: ");
		int option = scanner.nextInt();

		switch (option) {
		case 0:
			System.out.println("Is weekend");
			break;
		case 1:
			System.out.println("Is week day");
			break;
		case 2:
			System.out.println("Is week day");
			break;
		case 3:
			System.out.println("Is week day");
			break;
		case 4:
			System.out.println("Is week day");
			break;
		case 5:
			System.out.println("Is week day");
			break;
		case 6:
			System.out.println("Is week day");
			break;
		default:
			System.out.println("Not is a day");
			break;
		}
	}
}

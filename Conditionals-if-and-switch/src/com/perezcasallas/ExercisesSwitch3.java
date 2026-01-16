package com.perezcasallas;

import java.util.Scanner;

public class ExercisesSwitch3 {

	public static void main(String[] args) {
		// Determine the name of the day
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
			System.out.println("The name of the day is Sunday");
			break;
		case 1:
			System.out.println("The name of the day is Monday");
			break;
		case 2:
			System.out.println("The name of the day is Tuesday");
			break;
		case 3:
			System.out.println("The name of the day is Wednesday");
			break;
		case 4:
			System.out.println("The name of the day is Thursday");
			break;
		case 5:
			System.out.println("The name of the day is Friday");
			break;
		case 6:
			System.out.println("The name of the day is Saturday");
			break;
		default:
			System.out.println("Not is a day");
			break;
		}
	}
}

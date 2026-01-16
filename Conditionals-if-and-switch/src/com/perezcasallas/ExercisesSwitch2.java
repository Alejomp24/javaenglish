package com.perezcasallas;

import java.util.Scanner;

public class ExercisesSwitch2 {

	public static void main(String[] args) {
		// Determine name of the month
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of the month:");
		System.out.println("1 - January");
		System.out.println("2 - February");
		System.out.println("3 - March");
		System.out.println("4 - April");
		System.out.println("5 - May");
		System.out.println("6 - June");
		System.out.println("7 - July");
		System.out.println("8 - August");
		System.out.println("9 - September");
		System.out.println("10 - October");
		System.out.println("11 - November");
		System.out.println("12 - December");
		System.out.print("Enter a month: ");
		int option = scanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("The name of the month is January");
			break;
		case 2:
			System.out.println("The name of the month is February");
			break;
		case 3:
			System.out.println("The name of the month is March");
			break;
		case 4:
			System.out.println("The name of the month is April");
			break;
		case 5:
			System.out.println("The name of the month is May");
			break;
		case 6:
			System.out.println("The name of the month is June");
			break;
		case 7:
			System.out.println("The name of the month is July");
			break;
		case 8:
			System.out.println("The name of the month August");
			break;
		case 9:
			System.out.println("The name of the month is September");
			break;
		case 10:
			System.out.println("The name of the month is October");
			break;
		case 11:
			System.out.println("The name of the month is November");
			break;
		case 12:
			System.out.println("The name of the month is December");
			break;
		default:
			System.out.println("Not is a day");
			break;
		}

	}

}

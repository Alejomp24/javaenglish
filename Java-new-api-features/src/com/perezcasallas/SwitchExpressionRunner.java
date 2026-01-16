package com.perezcasallas;

public class SwitchExpressionRunner {

	public static String findDayOfTheWeek(int day) {
		String dayOfWeek = switch (day) {
		case 0 -> {
			// Algo de lógica y luego:
			yield "Sunday";
		}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		default -> throw new IllegalArgumentException("Invalid option " + day);
		};
		return dayOfWeek;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.perezcasallas;

public class MyNumberRunner {

	public static void main(String[] args) {
		// Constructor
		MyNumber number = new MyNumber(24);
		// Invocación de Metodos
		number.isPrime(); // Is a number prime?
		int sum = number.sumUptoN(); // Sum of numbers upto n?
		System.out.println("Sum of numbers upto n: " + sum);
		int sumOfDivisors = number.sumOfDivisors(); // Sumar los divisores de un numero, excepto el numero y el 1
		System.out.println("Sum of Divisors: " + sumOfDivisors);
		number.printANumberTriangle();
		// 1
		// 1 2
		// 1 2 3
	}

}

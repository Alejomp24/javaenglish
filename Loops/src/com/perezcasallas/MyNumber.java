package com.perezcasallas;

public class MyNumber {
	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public void isPrime() {
		boolean isNumberPrime = true;
		for (int i = 2; i <= number; i++) {
			if (i != number && i % 2 == 0) {
				isNumberPrime = false;
			}
		}
		if (isNumberPrime == true) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number not is prime");
		}
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sumDivisors = 0;
		for (int i = 2; i <= number - 1; i++) {
			if (i % 2 == 0) {
				sumDivisors += i;
			}
		}
		return sumDivisors;
	}

	public void printANumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}


}

package com.perezcasallas;

public class BiNumber {
	private int numero1;
	private int numero2;

	public BiNumber(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public int getNumber1() {
		return numero1;
	}

	public int getNumber2() {
		return numero2;
	}

	public int add() {
		return numero1 + numero2;
	}

	public int multiply() {
		return numero1 * numero2;
	}

	public void doubleN() {
		this.numero1 *= 2;
		this.numero2 *= 2;
	}
}

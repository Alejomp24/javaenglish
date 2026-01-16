package com.perezcasallas;

public class WhileNumberPlayer {

	private int player;
	private int i = 1;

	public WhileNumberPlayer(int player) {
		this.player = player;
	}

	public void printSquaresUptoLimit() {
		while (i < player) {
			System.out.printf("El cuadrado de %d es %d", i, i * i).println();
			i++;
		}
	}

	public void printCubesUptoLimit() {
		i = 1;
		while (i < player) {
			System.out.printf("El cubo de %d es %d", i, i * i * i).println();
			i++;
		}
	}
}
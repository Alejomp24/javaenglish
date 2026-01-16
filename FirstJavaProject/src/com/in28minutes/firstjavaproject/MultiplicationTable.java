package com.in28minutes.firstjavaproject;

public class MultiplicationTable {
	void print(int table) {														//Metodo print
		for(int i = 1; i<=10; i++) {									// <Lógica del metodo
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}
	
	void print(int table, int from, int to) {														//Metodo print
		for(int i = from; i<=to; i++) {									// <Lógica del metodo
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}
}

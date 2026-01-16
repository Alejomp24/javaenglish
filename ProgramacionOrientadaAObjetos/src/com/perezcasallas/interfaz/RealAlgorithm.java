package com.perezcasallas.interfaz;

//Implementación de una interfaz dentro de una clase
public class RealAlgorithm implements ComplexAlgorithm {

	@Override
	public int complexAlgorithm(int number1, int number2) {
		return number1 + number2;
	}

}

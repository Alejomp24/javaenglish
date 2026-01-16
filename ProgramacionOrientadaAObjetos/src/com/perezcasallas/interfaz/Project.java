package com.perezcasallas.interfaz;

public class Project {

	public static void main(String[] args) {
		ComplexAlgorithm algorithm = new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(12, 24));
	}

}

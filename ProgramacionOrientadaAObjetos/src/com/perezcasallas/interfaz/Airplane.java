package com.perezcasallas.interfaz;

public class Airplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("with fuel");
	}
}

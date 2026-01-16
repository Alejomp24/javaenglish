package com.in28minutes.oops;

public class MotorBike {
	//Variable privada
	private int speed;

	// Metodos
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed += howMuch;
	}

	int multiplicar(int resultado) {
		return 20 * 3;
	}

}

package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();


		ducati.setSpeed(100);

		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

	}

}

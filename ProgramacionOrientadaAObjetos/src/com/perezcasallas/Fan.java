package com.perezcasallas;

public class Fan {

	// state - caracteristicas
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	// creation - constructores
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// print the state - metodos
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 1);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return String.format("Make - %s, Radius - %f, Color - %s, isOn - %b, Speed - %d", make, radius, color, isOn,
				speed);
	}
}

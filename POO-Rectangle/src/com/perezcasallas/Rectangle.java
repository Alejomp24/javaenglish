package com.perezcasallas;

public class Rectangle {

	// Atributos
	private int length;
	private int width;
	private int perimeter;
	private int area;

	// Constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// Metodos
	public void perimeterRectangle() {
		this.perimeter = 2 * (this.length * this.width);
	}

	public void areaRectangle() {
		this.area = this.length * this.width;
	}

	@Override
	public String toString() {
		return String.format("Perimeter - %d, Area - %d", perimeter, area);
	}
}

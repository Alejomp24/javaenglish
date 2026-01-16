package com.perezcasallas;

public class Vehiculo {

	// Atributos
	private String modelo;
	private String transmision;
	private String color;
	private int cilindraje;
	private int precio;
	private int unidadesDisponibles;

	public Vehiculo(String modelo, String transmision, String color, int cilidraje, int precio,
			int unidadesDisponibles) {
		this.modelo = modelo;
		this.transmision = transmision;
		this.color = color;
		this.cilindraje = cilidraje;
		if (precio > 0) {
			this.precio = precio;
		}
		if (unidadesDisponibles > 0) {
			this.unidadesDisponibles = unidadesDisponibles;
		}
	}

	// Metodos para devolver información
	public String getModelo() {
		return modelo;
	}

	public String getTransmision() {
		return transmision;
	}

	public String getColor() {
		return color;
	}

	public int getPrecio() {
		return precio;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public int getUnidadesDisponibles() {
		return unidadesDisponibles;
	}
}

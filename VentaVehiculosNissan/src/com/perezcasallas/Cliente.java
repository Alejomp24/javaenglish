package com.perezcasallas;

public class Cliente {
	// Atributos
	private String nombre;
	private String direccion;
	private String correoElectronico;
	private long telefono;

	public Cliente(String nombre, String direccion, String correoElectronico, long telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
		this.telefono = telefono;
	}

	// Metodos para obtener informacion
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public long getTelefono() {
		return telefono;
	}
}

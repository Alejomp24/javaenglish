package com.perezcasallas;

public class Cuenta {

	// Atributos
	private String tipoCuenta;
	private long numeroCuenta;
	private double saldoDisponible;

	// Metodos solicitar información
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	// Metodos obtener información
	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

}

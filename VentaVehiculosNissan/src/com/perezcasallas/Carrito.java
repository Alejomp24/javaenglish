package com.perezcasallas;

public class Carrito {

	public static void main(String[] args) {

		// *** CLASE VEHICULO ***
		// OBJETOS Y ATRIBUTOS
		Vehiculo vdrive = new Vehiculo("V-Drive", "Automática", "Brown", 1600, 80990000, 223);
		// Vehiculo versa = new Vehiculo("Versa", "Mecánica", "Silver", 1600, 88990000,
		// 250);
		// Vehiculo sentra = new Vehiculo("Sentra", "Automática", "Red", 2000,
		// 118990000, 420);
		// Vehiculo qashqai = new Vehiculo("Qashqai", "Mecánica", "Blue", 2400,
		// 146990000, 420);

		// METODOS
		// Invocar metodos de la clase Vehiculo para armar la información del objeto
		// vdrive
		System.out.println(vdrive.getModelo() + "\n" + vdrive.getCilindraje() + "\n" + vdrive.getColor() + "\n"
				+ vdrive.getTransmision() + "\n" + vdrive.getPrecio());

		// Validar unidades solictadas contra el stock
		int unidades = 1;
		int stock = vdrive.getUnidadesDisponibles();
		if (stock <= unidades) {
			System.out.println("No hay unidades disponibles de: " + vdrive.getModelo());
		}
		else {
			System.out.println("Continue con la compra de su: " + vdrive.getModelo());
		}

		// *** CLASE CLIENTE ***
		// OBJETO Y ATRIBUTOS
		Cliente cliente1 = new Cliente("Eliam Mateo Pérez Muñoz", "Cra 6A #14-44 Sur Apto 927", "alejomp24@gmail.com",
				7713241);

		// METODOS
		// Invocar metodos de la clase Cliente para armar la informacion del objeto
		// cliente1
		System.out.println(
				"\n" +
				cliente1.getNombre() + "\n" + cliente1.getDireccion() + "\n" + cliente1.getCorreoElectronico());

		// *** CLASE CUENTA ***
		// OBJETO
		Cuenta cuenta1 = new Cuenta();

		// ATRIBUTOS
		// Atributos cuenta 1
		cuenta1.setTipoCuenta("Ahorros");
		cuenta1.setSaldoDisponible(100000000);
		cuenta1.setNumeroCuenta(530691714);

		// METODOS
		// Invocar metodos de la clase Cuenta para armar la informacion del objeto
		// cuenta1
		if (cuenta1.getSaldoDisponible() >= vdrive.getPrecio()) {
			System.out.println("\n" + cuenta1.getTipoCuenta() + "\n" + cuenta1.getNumeroCuenta());
		} else {
			System.out.println("\n Fondos insuficientes");
		}
	}
}

package com.perezcasallas;

//Clase
public class BookRunner {
	public static void main(String[] args) {

		// Objetos
		Book biblia = new Book(10000);
		Book diezMandamientos = new Book(5000);
		Book ingenieriaSoftware = new Book(2000);
		Book himnosCristianos = new Book();

		System.out.println(biblia.getNoOfCopies());
		System.out.println(diezMandamientos.getNoOfCopies());
		System.out.println(ingenieriaSoftware.getNoOfCopies());
		System.out.println(himnosCristianos.getNoOfCopies());

		// Invocar Metodos para cambiar Estado de los Objetos
		biblia.setNoOfCopies(240);
		biblia.increaseStock(10);
		System.out.println(biblia.getNoOfCopies());

		diezMandamientos.setNoOfCopies(120);
		diezMandamientos.increaseStock(30);
		System.out.println(diezMandamientos.getNoOfCopies());

		ingenieriaSoftware.setNoOfCopies(70);
		ingenieriaSoftware.increaseStock(30);
		System.out.println(ingenieriaSoftware.getNoOfCopies());

		int decrease = 200;
		biblia.decreaseStock(decrease);
		System.out.println(biblia.getNoOfCopies());

		diezMandamientos.decreaseStock(decrease);
		System.out.println(diezMandamientos.getNoOfCopies());

		ingenieriaSoftware.decreaseStock(decrease);
		System.out.println(ingenieriaSoftware.getNoOfCopies());

	}
}



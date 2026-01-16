package com.perezcasallas.interfaz;

public class FlyableRunner {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();

		Airplane aerplane = new Airplane();
		aerplane.fly();
	}
}

//En la clase ruuner también se puede desarrollar el ejercicio de la siguiente manera

//Interfaz
//interface Flyable{
//	void fly();
//}

//Clases
//class Bird implements Flyable{
//	public void fly(){
//		System.out.println("with wings");
//	}
//}
//class Airplane implements Flyable{
//public void fly(){
//	System.out.println("with fuel");
//}
//}

//Ejecutable
//public class FlyableRunner {
//	public static void main(String[] args) {
//		Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
//		for(Flyable object : flyingObjects){
//			object.fly();
//		}
//	}
//}
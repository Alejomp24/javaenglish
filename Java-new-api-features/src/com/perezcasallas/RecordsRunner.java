package com.perezcasallas;

public class RecordsRunner {
	// Public accesor methods, constructor, equals, hashcode and toString are
	// automatically create.
	record Person(String name, String email, String phoneNumber) {
		// You can create custom implementations if you would want
		// Compact Constructors are only allowed in Records
		Person {
			if (name == null) {
				throw new IllegalArgumentException("name is null");
			}
		}
	}

	public static void main(String[] args) {
		Person person = new Person("Mario", "alejomp24@gmail.com", "3215093873");
		Person person1 = new Person("Mario", "alejomp24@gmail.com", "3215093873");
		System.out.println(person);
		System.out.println(person.equals(person1));
		System.out.println(person.name());
	}
}

//Puede agregar campos estáticos, inicializadores estáticos y métodos estáticos, pero no puede agregar variables de instancia ni inicializadores de instancia.
//Sin embargo, puedes agregar métodos de instancia.

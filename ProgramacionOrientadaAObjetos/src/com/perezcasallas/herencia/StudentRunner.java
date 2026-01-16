package com.perezcasallas.herencia;

public class StudentRunner {

	public static void main(String[] args) {
		// Student student = new Student();
		// student.setName("Eliam");
		// student.setEmail("alejomp24@gmail.com");

		Person person = new Person("Eliam");
		String value = person.toString(); // Inheritance
		System.out.println(value);
		System.out.println(person);
	}

}

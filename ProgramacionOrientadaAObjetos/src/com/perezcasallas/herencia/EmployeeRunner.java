package com.perezcasallas.herencia;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee();
		// employee.setName("Eliam");
		employee.setEmail("alejomp24@gmail.com");
		employee.setPhonenumber("3215093873");
		employee.setTitle("Driver");
		employee.setEmployeeGrade('A');
		employee.setEmployer("Nissan");
		System.out.println(employee);
	}
}

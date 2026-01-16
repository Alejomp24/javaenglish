package com.perezcasallas;

public class CustomerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line 1", "Novaterra", "70024");
		Customer customer = new Customer("Eliam", homeAddress);

		Address workAddress = new Address("line 1 for work", "Arrayan", "70012");
		customer.setWorkaddress(workAddress);

		System.out.println(customer);
	}
}

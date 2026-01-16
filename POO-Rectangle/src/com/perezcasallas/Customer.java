package com.perezcasallas;

public class Customer {

	private String name;
	private Address homeaddress; // Object Composition, un objeto contiene una instancia de otra clase
	private Address workaddress;

	public Customer(String name, Address homeaddress) {
		this.name = name;
		this.homeaddress = homeaddress;
	}

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public Address getWorkaddress() {
		return workaddress;
	}

	public void setWorkaddress(Address workaddress) {
		this.workaddress = workaddress;
	}

	@Override
	public String toString() {
		return String.format("Name - [%s] Home Address - [%s] Work Address - [%s]", name, homeaddress, workaddress);
	}

}

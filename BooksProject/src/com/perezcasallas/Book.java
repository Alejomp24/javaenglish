package com.perezcasallas;

public class Book {

	private int noOfCopies;

	Book() {
		this(5);
	}

	Book(int noOfCopies) { // Constructor
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies >= 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseStock(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseStock(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}
}

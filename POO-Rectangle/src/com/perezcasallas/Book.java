package com.perezcasallas;

import java.util.ArrayList;

public class Book {

	// Atributos
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	// Constructor
	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	// Metodos
	public void addReview(Review review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return String.format("ID - [%d] Name - [%s] Author - [%s] Review - [%s]", id, name, author, reviews);
	}



}

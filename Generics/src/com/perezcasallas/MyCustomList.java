package com.perezcasallas;

import java.util.ArrayList;

public class MyCustomList<T> { // Los <T> indican que se está creando un genérico
								// Se puede restringir el generico por tipo de dato ej. <T extends Number>
	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	@Override
	public String toString() {
		return list.toString();
	}

	public T get(int index) { // Se crea un valor tipo Generico, en este caso T
		return list.get(index);
	}
}

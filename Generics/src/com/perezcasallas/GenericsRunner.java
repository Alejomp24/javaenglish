package com.perezcasallas;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	// Wild Limite Superior //
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}
	// Wild Limite Superior //

	// Wild Limite Inferior //
	static void addCoupleOfValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}
	// Wild Limite Inferior //

	public static void main(String[] args) {

		// Wild Limite Inferior //
		List emptyList = new ArrayList<Number>();
		addCoupleOfValues(emptyList);
		System.out.println(emptyList);
		// Wild Limite Inferior //

		// Wild Limite Superior //
		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4, 5)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1, 4.1, 5.1)));
		System.out.println(sumOfNumberList(List.of(1l, 2l, 3l, 4l, 5l)));
		// Wild Limite Superior //

		MyCustomList<String> list = new MyCustomList<>(); // <String> indica uso de genérico
		list.addElement("Element 1");
		list.addElement("Element 2");
		String value = list.get(0);
		System.out.println(list);

		MyCustomList<Integer> list2 = new MyCustomList<>(); // <Integer> indica uso de genérico
		list2.addElement(Integer.valueOf(24));
		list2.addElement(Integer.valueOf(12));
		Integer number = list2.get(0);
		System.out.println(list2);
	}

}

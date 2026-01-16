package com.perezcasallas;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Mario", "Pérez");
		List<Integer> names2 = List.of(12, 24);
		List<String> names3 = List.of("Eliam", "Mateo");

		var names = List.of(names1, names2, names3); // var Inferencia de Tipos
		names.stream().forEach(System.out::println);
	}

}

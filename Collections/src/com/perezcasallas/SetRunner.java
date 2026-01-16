package com.perezcasallas;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println(treeSet);
	}

}

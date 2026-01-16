package com.perezcasallas;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Alejo");
		names.add("Yolis");
		names.add("Eliam");

		List<String> copyOfNames = List.copyOf(names);

		doNotChanges(copyOfNames);
		System.out.println(copyOfNames);
	}

	private static void doNotChanges(List<String> names) {
		names.add("ShouldNotBeAllowed");
	}
}

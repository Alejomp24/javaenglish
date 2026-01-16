package com.perezcasallas;

public class TextBlocksRunner {

	public static void main(String[] args) {
		String str = """
				Mario: %s
				Yolanda: %s
				Eliam
				""".formatted("Pérez", "Muñoz");
		System.out.print(str);
	}
}

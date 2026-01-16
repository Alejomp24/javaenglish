package com.perezcasallas;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('A');
		System.out.println(myChar.isVowel()); // 'a', 'e', 'i', 'o', 'u' and Capitals
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowerCaseAlphabets(); // Es un metodo estático y no es necesario crear una instancia
		MyChar.printUpperCaseAlphabets(); // Es un metodo estático y no es necesario crear una instancia
	}
}

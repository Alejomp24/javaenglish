package com.perezcasallas;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U') {
			return true;
		}
		else {
			return false;
		}

	}

	public boolean isDigit() {
		if (ch >= 48 && ch <= 57) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if (isAlphabet() && !isVowel()) { // Si es del alfabeto Y NO es vocal
			return true;
		} else {
			return false;
		}
	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}
}

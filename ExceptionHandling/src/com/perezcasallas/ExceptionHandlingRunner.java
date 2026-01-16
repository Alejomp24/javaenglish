package com.perezcasallas;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {

		try {
			String str = null;
			str.length();
			System.out.println("Method Ended");
		} catch (NullPointerException ex) {
			System.out.println("Null Pointer Exception EMPM");
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

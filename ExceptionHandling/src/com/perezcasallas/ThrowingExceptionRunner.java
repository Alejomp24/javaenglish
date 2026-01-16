package com.perezcasallas;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) {
		if (!this.currency.equals(that.currency)) {
			// throw new RuntimeException("Currencies Don't Match " + this.currency + " & "
			// + that.currency); // Lanzar una
			throw new CurrenciesDoNotMathException("Currencies Don't Match " + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotMathException extends RuntimeException {
	public CurrenciesDoNotMathException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMathException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}

}

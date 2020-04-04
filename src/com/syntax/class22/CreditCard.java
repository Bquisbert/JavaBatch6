package com.syntax.class22;

public class CreditCard {
	double balance;
	double intrest;

	public CreditCard(double balance) {
		this.balance = balance;
	}

	double total() {

		if (balance < 1000) {
			intrest = balance * 0.1;
		} else {
			intrest = 0;
		}
		return intrest;
	}
}

class Visa extends CreditCard {
	Visa(double balance) {
		super(balance);
	}

	double total() {

		if (balance < 1000) {
			intrest = balance * 0.2;
		} else {
			intrest = 0;
		}
		return intrest;
	}
}

class AX extends CreditCard {
	AX(double balance) {
		super(balance);
	}

	double total() {

		if (balance < 1000) {
			intrest = balance * 0.5;
		} else {
			intrest = 0;
		}
		return intrest;
	}
}

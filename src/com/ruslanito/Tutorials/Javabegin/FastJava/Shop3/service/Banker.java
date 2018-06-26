package com.ruslanito.Tutorials.Javabegin.FastJava.Shop3.service;

import ru.Javabegin.FastJava.Shop3.bank.BaseBank;

public class Banker extends BaseEmployee {

	private BaseBank bank;

	public void sendRequest() {

	}

	public BaseBank getBank() {
		return bank;
	}

	public void setBank(BaseBank bank) {
		this.bank = bank;
	}

}

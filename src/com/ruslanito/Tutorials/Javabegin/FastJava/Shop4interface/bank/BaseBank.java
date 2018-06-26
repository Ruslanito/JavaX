package com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.bank;

import ru.Javabegin.FastJava.Shop4interface.interfaces.BankInterface;

public abstract class BaseBank implements BankInterface {

	private String name;
	private String creditDescription;

	@Override
	public String getname() {
		return name;
	}

	@Override
	public void checkInfo() {

	}

	@Override
	public void giveCredit() {

	}

	@Override
	public String getCreditDescription() {
		return creditDescription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

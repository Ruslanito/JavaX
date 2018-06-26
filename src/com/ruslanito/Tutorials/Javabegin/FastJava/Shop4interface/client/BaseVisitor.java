package com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.client;

import ru.Javabegin.FastJava.Shop4interface.interfaces.VisitorInterface;

public abstract class BaseVisitor implements VisitorInterface {

	private String name;

	@Override
	public void buy() {

	}

	@Override
	public void returnGoods() {

	}

	@Override
	public String getName() {
		return name;
	}

}

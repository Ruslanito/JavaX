package com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.client;

public class VipVisitor extends BaseVisitor{
	private float discount;

	@Override
	public void buy() {
		if (!checkDiscount()) {
			super.buy();
		} else {

		}
	}
	private boolean checkDiscount(){ 
		return discount>0;
	}
}

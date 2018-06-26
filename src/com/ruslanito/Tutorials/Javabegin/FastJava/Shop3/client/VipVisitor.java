package com.ruslanito.Tutorials.Javabegin.FastJava.Shop3.client;

public class VipVisitor extends BaseVisitor {
	private float discount;

	@Override
	public void buyGoods() {
		if (!checkDiscount()) {
			super.buyGoods(); // купить со скидкой discount
		} else {

		}

	}

	private boolean checkDiscount() {
		return discount > 0;

	}

}

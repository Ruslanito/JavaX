package com.ruslanito.Tutorials.Javabegin.FastJava.Shop3.goods;

import ru.Javabegin.FastJava.Shop3.department.BaseDepartment;

public class BaseGoods {
	private double price;//стоимость товара
	private boolean hasGuarantee;//наличие гарантии
	private String name;//название товара
	private BaseDepartment department;//отдел товара
	private String company;//производитель товара

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isHasGuarantee() {
		return hasGuarantee;
	}

	public void setHasGuarantee(boolean hasGuarantee) {
		this.hasGuarantee = hasGuarantee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BaseDepartment getDepartment() {
		return department;
	}

	public void setDepartment(BaseDepartment department) {
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}

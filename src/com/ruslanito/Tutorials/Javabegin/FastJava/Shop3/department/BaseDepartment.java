package com.ruslanito.Tutorials.Javabegin.FastJava.Shop3.department;

import java.util.ArrayList;

import ru.Javabegin.FastJava.Shop3.goods.BaseGoods;
import ru.Javabegin.FastJava.Shop3.service.BaseEmployee;

public class BaseDepartment {
	private String name;
	private ArrayList<BaseEmployee> employeeList;
	private ArrayList<BaseGoods> goodsList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<BaseEmployee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<BaseEmployee> employeeList) {
		this.employeeList = employeeList;
	}

	public ArrayList<BaseGoods> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(ArrayList<BaseGoods> goodsList) {
		this.goodsList = goodsList;
	}

}

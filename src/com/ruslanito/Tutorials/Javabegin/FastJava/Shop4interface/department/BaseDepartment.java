package com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.department;

import java.util.ArrayList;

import com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.interfaces.DepartmentInterface;
import com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.interfaces.EmployeeInterface;
import com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.interfaces.GoodsInterface;

public abstract class BaseDepartment implements DepartmentInterface {
	private String name;
	private ArrayList<EmployeeInterface> employeeList;
	private ArrayList<GoodsInterface> goodsList;

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public ArrayList<EmployeeInterface> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public ArrayList<GoodsInterface> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
		this.goodsList = goodsList;
	}

}

package com.ruslanito.Tutorials.Javabegin.FastJava.Shop3.service;

import ru.Javabegin.FastJava.Shop3.department.BaseDepartment;

public class BaseEmployee {

	private String name;
	private BaseDepartment department;
	private boolean free;

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

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

}

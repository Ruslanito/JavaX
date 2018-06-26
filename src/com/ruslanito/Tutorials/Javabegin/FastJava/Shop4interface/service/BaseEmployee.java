package com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.service;

import com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.interfaces.DepartmentInterface;
import com.ruslanito.Tutorials.Javabegin.FastJava.Shop4interface.interfaces.EmployeeInterface;

public abstract class BaseEmployee implements EmployeeInterface {
	private String name;
	private DepartmentInterface department;
	private boolean free;

	@Override
	public String getName() {
		return name;
	}

	public void setMame(String name) {
		this.name = name;
	}

	@Override
	public DepartmentInterface getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentInterface department) {
		this.department = department;
	}

	@Override
	public boolean isFree() {
		return free;
	} 
	public void setFree (boolean free){ 
		this.free = free;
	}

}

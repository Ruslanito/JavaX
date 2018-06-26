package com.ruslanito.Tutorials.Javabegin.FastJava.Shop3;

import java.util.ArrayList;

import ru.Javabegin.FastJava.Shop3.client.BaseVisitor;
import ru.Javabegin.FastJava.Shop3.department.BaseDepartment;
import ru.Javabegin.FastJava.Shop3.service.Administrator;

public class SaleRoom {

	private ArrayList<BaseDepartment> departmentList;

	private String name;

	private ArrayList<BaseVisitor> visitorList;

	private Administrator administrator;

	public ArrayList<BaseDepartment> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(ArrayList<BaseDepartment> departmentList) {
		this.departmentList = departmentList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<BaseVisitor> getVisitorList() {
		return visitorList;
	}

	public void setVisitorList(ArrayList<BaseVisitor> visitorList) {
		this.visitorList = visitorList;
	}

	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

}

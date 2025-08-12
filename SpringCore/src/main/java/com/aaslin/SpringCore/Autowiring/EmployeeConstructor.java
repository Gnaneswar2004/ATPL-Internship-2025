package com.aaslin.SpringCore.Autowiring;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component("employeeConstructor")
public class EmployeeConstructor {

	private Department department;

	@Autowired
	public EmployeeConstructor(Department department) {
		super();
		this.department = department;
	}

	public void show() {
		System.out.println("Using Constructor Injection.");
		System.out.println("Employee Department : " + department.getDeptName());
	}
}
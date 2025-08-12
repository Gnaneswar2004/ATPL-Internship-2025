package com.aaslin.SpringCore.Autowiring;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component("employeeSetter")
public class EmployeeSetter {

	private Department department;

	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public void show() {
		System.out.println("Using Setter Injection.");
		System.out.println("Employee Department : " + department.getDeptName());
	}
}
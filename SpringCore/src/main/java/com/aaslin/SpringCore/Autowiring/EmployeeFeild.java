package com.aaslin.SpringCore.Autowiring;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component("employeeFeild")
public class EmployeeFeild {

	@Autowired
	private Department department;
	
	public void show() {
		System.out.println("Using Feild Injection.");
		System.out.println("Employee Department : " + department.getDeptName());
	}
}
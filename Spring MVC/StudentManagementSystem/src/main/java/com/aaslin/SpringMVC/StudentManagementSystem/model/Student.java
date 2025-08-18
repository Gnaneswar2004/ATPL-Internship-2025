package com.aaslin.SpringMVC.StudentManagementSystem.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Student {
	private int id;
	
	@NotBlank(message = "Name is required")
	private String name;
	
	@NotBlank(message = "Email is required")
	@Email(message = "Invalid Email format")
	private String email;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int idCounter) {
		this.id = idCounter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
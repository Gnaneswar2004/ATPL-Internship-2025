package com.aaslin.SpringCore.ConstructorInjection;

public class Course {

	private String name;

	public Course(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void display() {
		System.out.println("Course Nmae : " + name);
	}
}
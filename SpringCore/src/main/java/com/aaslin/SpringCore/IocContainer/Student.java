package com.aaslin.SpringCore.IocContainer;

public class Student {
	
	private String name;
	
	public Student() {
		System.out.println("In Student...");	
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Student Name : " + name);
	}
}
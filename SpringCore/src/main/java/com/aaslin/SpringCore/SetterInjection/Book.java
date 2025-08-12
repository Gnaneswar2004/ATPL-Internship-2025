package com.aaslin.SpringCore.SetterInjection;

public class Book {

	private String name;

	public Book() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Book Name : " + name);
	}
}
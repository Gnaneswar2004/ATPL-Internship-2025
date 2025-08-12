package com.aaslin.SpringCore.ConstructorInjection;

public class Faculty {

	private Course course;

	public Faculty(Course course) {
		super();
		this.course = course;
	}

	public void show() {
		System.out.println("Faculty has a Course.");
		course.display();
	}
}
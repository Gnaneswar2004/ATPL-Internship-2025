package com.aaslin.SpringCore.IocContainer;

public class College {
	
	private Student student;
	
	public College() {
		System.out.println("In College...");
	}

	public College(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void show() {
		System.out.println("College has Student.");
		student.display();
	}
}
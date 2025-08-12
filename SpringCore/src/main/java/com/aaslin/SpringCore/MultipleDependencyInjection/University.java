package com.aaslin.SpringCore.MultipleDependencyInjection;

public class University {
	
	private Faculty faculty;
	private Library library;

	public University(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public void display() {
		System.out.println("Faculty Name : " + faculty.getName());
		System.out.println("Library Name : " + library.getBook());
	}
}
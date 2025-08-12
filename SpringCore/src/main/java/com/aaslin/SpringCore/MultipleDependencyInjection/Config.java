package com.aaslin.SpringCore.MultipleDependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Faculty faculty() {
		return new Faculty("Sudheer.");
	}

	@Bean
	public Library library() {
		Library library = new Library();
		library.setBook("Java Fundamentals.");
		return library;
	}
	
	@Bean
	public University university() {
		University university = new University(faculty());
		university.setLibrary(library());
		return university;
	}
}
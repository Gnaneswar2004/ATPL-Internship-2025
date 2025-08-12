package com.aaslin.SpringCore.SetterInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Book book() {
		Book book = new Book();
		book.setName("Spring Framework.");
		return book;
	}
	
	@Bean
	public Library library() {
		Library library = new Library();
		library.setBook(book());
		return library;
	}
}
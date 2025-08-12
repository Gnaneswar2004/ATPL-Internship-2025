package com.aaslin.SpringCore.ConstructorInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Course course() {
		return new Course("Spring.");
	}
	
	@Bean
	public Faculty faculty() {
		return new Faculty(course());
	}
}
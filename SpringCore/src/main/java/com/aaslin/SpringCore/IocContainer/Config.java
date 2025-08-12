package com.aaslin.SpringCore.IocContainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Student student() {
		return new Student("Gnani");
	}
	
	@Bean
	public College college() {
		return new College(student());
	}
}
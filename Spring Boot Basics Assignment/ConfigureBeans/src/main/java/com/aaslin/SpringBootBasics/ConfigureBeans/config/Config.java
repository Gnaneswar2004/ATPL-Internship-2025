package com.aaslin.SpringBootBasics.ConfigureBeans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.aaslin.SpringBootBasics.ConfigureBeans.service.GreetingService;

@Configuration
public class Config {

	@Bean
	public GreetingService greetingService() {
		
		return new GreetingService();
	}
}
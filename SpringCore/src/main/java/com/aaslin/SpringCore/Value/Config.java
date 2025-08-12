package com.aaslin.SpringCore.Value;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.aaslin.SpringCore.Value")
@PropertySource("classpath:application.properties")
public class Config {

}
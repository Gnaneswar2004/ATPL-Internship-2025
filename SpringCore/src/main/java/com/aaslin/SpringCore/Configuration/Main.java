package com.aaslin.SpringCore.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		TrainingCenter center = context.getBean(TrainingCenter.class);
		center.showTrainerDetails();
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
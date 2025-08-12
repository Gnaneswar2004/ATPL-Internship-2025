package com.aaslin.SpringCore.MultipleDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("multipleDependencyInjection.xml");
		University university = context.getBean("university", University.class);
		university.display();
		((ClassPathXmlApplicationContext)context).close();
		
		ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
		University university1 = context1.getBean(University.class);
		university1.display();
		((AnnotationConfigApplicationContext)context1).close();
	}
}
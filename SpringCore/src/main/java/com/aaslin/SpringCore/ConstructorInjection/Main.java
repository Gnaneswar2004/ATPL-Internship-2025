package com.aaslin.SpringCore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String args[]) {
		
		System.out.println("Constructor Injection Using Xml based Configuration.");
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorInjection.xml");
		Faculty faculty = context.getBean("faculty",Faculty.class);
		faculty.show();
		
		((ClassPathXmlApplicationContext)context).close();
		
		System.out.println("Constructor Injection Using Java based Configuration.");
		ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
		Faculty faculty1 = context1.getBean(Faculty.class);
		faculty1.show();
		
		((AnnotationConfigApplicationContext)context1).close();
	}
}
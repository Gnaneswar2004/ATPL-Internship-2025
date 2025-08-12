package com.aaslin.SpringCore.SetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
		
		System.out.println("Setter Injection Using Xml based Configuration.");
		ApplicationContext context = new ClassPathXmlApplicationContext("setterInjection.xml");
		Library library = context.getBean("library",Library.class);
		library.show();
		
		((ClassPathXmlApplicationContext)context).close();
		
		System.out.println("Setter Injection Using Java based Configuration.");
		ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
		Library library1 = context1.getBean(Library.class);
		library1.show();
		
		((AnnotationConfigApplicationContext)context1).close();
	}
}
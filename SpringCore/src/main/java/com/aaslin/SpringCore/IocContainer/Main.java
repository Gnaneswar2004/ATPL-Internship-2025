package com.aaslin.SpringCore.IocContainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String args[]) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		College college = context.getBean("college",College.class);
		college.show();
		
		((ClassPathXmlApplicationContext)context).close();
		
		ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);
		College college1 = context1.getBean(College.class);
		college1.show();
		
		((AnnotationConfigApplicationContext)context1).close();
	}
}
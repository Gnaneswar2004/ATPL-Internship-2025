package com.aaslin.SpringCore.BeanLifeCycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main (String args[]) {
		
//		System.out.println("Bean LifeCycle using Xml Config.");
//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle.xml");
//		context.close();
	
		System.out.println("Bean LifeCycle using Interfaces.");
		ConfigurableApplicationContext context1 = new ClassPathXmlApplicationContext("beanLifecycle.xml");
		context1.close();
		
		System.out.println("Bean LifeCycle using Annotations.");
		ConfigurableApplicationContext context2 = new ClassPathXmlApplicationContext("beanLifecycle.xml");
		context2.close();
	}
}
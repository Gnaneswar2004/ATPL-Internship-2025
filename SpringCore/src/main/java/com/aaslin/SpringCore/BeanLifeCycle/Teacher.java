package com.aaslin.SpringCore.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean, DisposableBean {
	
	public Teacher() {
		System.out.println("In Teacher...");
	}
	
	public void init() {
		System.out.println("Instantiated using Xml Config.");
	}
	
	public void destroys() {
		System.out.println("Destroyed using Xml Config.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Instantiated using IntializingBean Interface.");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroyed using DisposableBean Interface.");
	}
	
	@PostConstruct
	public void instantiated() {
		System.out.println("Instantiated using @PostConstruct Annotation.");
	}
	
	@PreDestroy
	public void destroyed() {
		System.out.println("Instantiated using @PreDestroy Annotation.");
	}
}
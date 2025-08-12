package com.aaslin.SpringCore.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        System.out.println("Singleton Scope.");
        BeanScopeSingleton singleton1 = context.getBean(BeanScopeSingleton.class);
        BeanScopeSingleton singleton2 = context.getBean(BeanScopeSingleton.class);
        System.out.println("Singleton1: " + singleton1);
        System.out.println("Singleton2: " + singleton2);

        System.out.println("Prototype Scope.");
        BeanScopePrototype prototype1 = context.getBean(BeanScopePrototype.class);
        BeanScopePrototype prototype2 = context.getBean(BeanScopePrototype.class);
        System.out.println("Prototype1: " + prototype1);
        System.out.println("Prototype2: " + prototype2);
        
        ((AnnotationConfigApplicationContext)context).close();
    }
}
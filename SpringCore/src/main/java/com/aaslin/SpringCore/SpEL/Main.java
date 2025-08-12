package com.aaslin.SpringCore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
    public static void main(String[] args) {
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Product product = context.getBean(Product.class);
        product.printDetails();
        
        ((AnnotationConfigApplicationContext)context).close();
    }
}
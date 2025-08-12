package com.aaslin.SpringCore.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String  args[]) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		EmployeeFeild feild = context.getBean("employeeFeild",EmployeeFeild.class);
		feild.show();
		
		EmployeeSetter setter = context.getBean("employeeSetter",EmployeeSetter.class);
		setter.show();
		
		EmployeeConstructor constructor = context.getBean("employeeConstructor",EmployeeConstructor.class);
		constructor.show();
		
		((AnnotationConfigApplicationContext)context).close();
	}
}
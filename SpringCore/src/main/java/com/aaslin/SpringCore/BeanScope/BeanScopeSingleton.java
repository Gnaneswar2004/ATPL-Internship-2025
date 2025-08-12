package com.aaslin.SpringCore.BeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BeanScopeSingleton {

	public BeanScopeSingleton() {
		System.out.println("Singleton Bean Creaeted: " + this);
	}
}
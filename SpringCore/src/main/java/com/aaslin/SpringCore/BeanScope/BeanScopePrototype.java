package com.aaslin.SpringCore.BeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanScopePrototype {

	public BeanScopePrototype() {
		System.out.println("Prototype Bean Created: " + this);
	}
}
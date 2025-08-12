package com.aaslin.SpringCore.Qualifier;

import org.springframework.stereotype.Component;

@Component("manager")
public class Manager implements Leader{

	@Override
	public void leadTeam() {
		System.out.println("Manager is leading the team.");
	}
}
package com.aaslin.SpringCore.Qualifier;

import org.springframework.stereotype.Component;

@Component("teamLead")
public class TeamLead implements Leader {

	@Override
	public void leadTeam() {
		System.out.println("TeamLead is leading the team.");
	}
}
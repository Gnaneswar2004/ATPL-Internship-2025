package com.aaslin.SpringCore.Qualifier;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class Project {

	private Leader leader;

    @Autowired
    
    @Qualifier("manager") //for manager as Qualifier
    
//    @Qualifier("teeamLead") //for teamLead as Qualifier
    
    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public void start() {
        leader.leadTeam();
    }
}
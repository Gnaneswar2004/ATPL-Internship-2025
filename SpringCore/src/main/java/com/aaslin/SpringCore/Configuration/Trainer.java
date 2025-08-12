package com.aaslin.SpringCore.Configuration;

import org.springframework.stereotype.Component;

@Component
public class Trainer {
	
    private String name = "Gnani";
    private String course = "Java";

    public String getDetails() {
        return "Trainer Name : " + name + ", Course : " + course;
    }
}
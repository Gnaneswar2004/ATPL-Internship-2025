package com.aaslin.SpringCore.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrainingCenter {

    @Autowired
    private Trainer trainer;

    public void showTrainerDetails() {
    	
        System.out.println("Training Center Info :");
        System.out.println(trainer.getDetails());
    }
}
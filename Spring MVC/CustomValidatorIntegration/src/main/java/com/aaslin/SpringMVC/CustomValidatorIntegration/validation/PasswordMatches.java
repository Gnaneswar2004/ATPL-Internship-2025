package com.aaslin.SpringMVC.CustomValidatorIntegration.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Target({ ElementType.TYPE })  // Apply at class level
@Retention(RetentionPolicy.RUNTIME)

public @interface PasswordMatches {
	
    String message() default "Passwords do not match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
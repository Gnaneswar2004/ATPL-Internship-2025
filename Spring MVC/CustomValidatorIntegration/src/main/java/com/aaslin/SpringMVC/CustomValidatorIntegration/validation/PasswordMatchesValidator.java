package com.aaslin.SpringMVC.CustomValidatorIntegration.validation;

import com.aaslin.SpringMVC.CustomValidatorIntegration.dto.UserRegistration;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, UserRegistration> {

    @Override
    public boolean isValid(UserRegistration user, ConstraintValidatorContext context) {
        if (user.getPassword() == null || user.getConfirmPassword() == null) {
            return false;
        }
        return user.getPassword().equals(user.getConfirmPassword());
    }
}
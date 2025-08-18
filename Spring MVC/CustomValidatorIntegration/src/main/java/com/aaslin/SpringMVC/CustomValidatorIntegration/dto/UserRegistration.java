package com.aaslin.SpringMVC.CustomValidatorIntegration.dto;

import com.aaslin.SpringMVC.CustomValidatorIntegration.validation.PasswordMatches;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@PasswordMatches
public class UserRegistration {

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Password is required")
    private String password;

    @NotBlank(message = "Confirm password is required")
    private String confirmPassword;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
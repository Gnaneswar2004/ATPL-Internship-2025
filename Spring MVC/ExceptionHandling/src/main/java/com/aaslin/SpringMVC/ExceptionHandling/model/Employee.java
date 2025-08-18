package com.aaslin.SpringMVC.ExceptionHandling.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;

public class Employee {
    @NotBlank(message = "Name must not be blank")
    private String name;

    @Email(message = "Email is invalid")
    private String email;

    @Min(value = 1, message = "Salary must be greater than 0")
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
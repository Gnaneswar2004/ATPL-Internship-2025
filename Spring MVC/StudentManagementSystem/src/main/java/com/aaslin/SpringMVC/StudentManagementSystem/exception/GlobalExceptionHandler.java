package com.aaslin.SpringMVC.StudentManagementSystem.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(StudentNotFoundException.class)
    public String handleStudentNotFound(StudentNotFoundException ex, Model model) {
        model.addAttribute("message", ex.getMessage());
        return "404";
    }

    @ExceptionHandler(Exception.class)
    public String handleGeneric(Exception ex, Model model) {
        model.addAttribute("message", ex.getMessage());
        return "error";
    }
}
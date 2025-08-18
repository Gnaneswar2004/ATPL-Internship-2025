package com.aaslin.SpringMVC.CustomValidatorIntegration.controller;

import com.aaslin.SpringMVC.CustomValidatorIntegration.dto.UserRegistration;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/register")
public class UserRegistrationController {

    @PostMapping
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserRegistration user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            bindingResult.getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
            bindingResult.getGlobalErrors().forEach(error -> errors.put(error.getObjectName(), error.getDefaultMessage()));
            return ResponseEntity.badRequest().body(errors);
        }
        return ResponseEntity.ok("User registered successfully!");
    }
}
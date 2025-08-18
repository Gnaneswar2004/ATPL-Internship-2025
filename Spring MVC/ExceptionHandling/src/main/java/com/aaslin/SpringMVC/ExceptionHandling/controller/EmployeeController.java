package com.aaslin.SpringMVC.ExceptionHandling.controller;

import com.aaslin.SpringMVC.ExceptionHandling.model.Employee;
import com.aaslin.SpringMVC.ExceptionHandling.exception.NotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private Map<Integer, Employee> employees = new HashMap<>();
    private int idCounter = 1;

    @PostMapping
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) {
    	
        employees.put(idCounter, employee);
        idCounter++;
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
    	
        Employee employee = employees.get(id);
        if (employee == null) {
            throw new NotFoundException("Employee with id " + id + " not found");
        }
        return ResponseEntity.ok(employee);
    }
}
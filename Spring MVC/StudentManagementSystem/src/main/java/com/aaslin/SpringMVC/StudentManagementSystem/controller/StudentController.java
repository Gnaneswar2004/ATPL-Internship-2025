package com.aaslin.SpringMVC.StudentManagementSystem.controller;

import com.aaslin.SpringMVC.StudentManagementSystem.model.Student;
import com.aaslin.SpringMVC.StudentManagementSystem.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;
    
    public StudentController(StudentService service) { 
    	
    	this.service = service; 
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("students", service.findAll());
        return "students-list";
    }

    @GetMapping("/new")
    public String createForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping
    public String create(@Valid @ModelAttribute("student") Student student,
                         BindingResult binding, Model model) {
        if (binding.hasErrors()) {
            return "student-form";
        }
        service.create(student);
        return "redirect:/students";
    }

    @GetMapping("/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("student", service.findById(id));
        return "student-view";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("student", service.findById(id));
        return "student-form";
    }

    @PostMapping("/{id}/edit")
    public String update(@PathVariable int id, @Valid @ModelAttribute("student") Student student, BindingResult binding) {
        if (binding.hasErrors()) {
            return "student-form";
        }
        service.update(id, student);
        return "redirect:/students/" + id;
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "redirect:/students";
    }
}
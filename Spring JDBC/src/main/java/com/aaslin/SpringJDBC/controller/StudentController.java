package com.aaslin.SpringJDBC.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaslin.SpringJDBC.dao.StudentDao;
import com.aaslin.SpringJDBC.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentDao studentDao;
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student) {
		int row = studentDao.addStudent(student);
		if (row >= 1) {
			return "Student data added successfully!";
		}
		else {
			return "Failed to add Student Data!";
		}
	}
	
	@GetMapping("/list")
	public @ResponseBody Iterable<Student> listStudents() {
		return studentDao.listStudents();
	}
}
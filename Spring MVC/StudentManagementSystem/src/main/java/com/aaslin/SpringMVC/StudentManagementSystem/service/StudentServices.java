package com.aaslin.SpringMVC.StudentManagementSystem.service;

import java.util.List;
import com.aaslin.SpringMVC.StudentManagementSystem.model.Student;

public interface StudentServices {

	List<Student> findAll();
    Student findById(int id);
    Student create(Student student);
    Student update(int id, Student student);
    void delete(int id);
}
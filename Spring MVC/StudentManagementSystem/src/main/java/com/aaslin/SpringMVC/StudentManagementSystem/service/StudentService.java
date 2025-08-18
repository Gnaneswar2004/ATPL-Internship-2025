package com.aaslin.SpringMVC.StudentManagementSystem.service;

import org.springframework.stereotype.Service;
import com.aaslin.SpringMVC.StudentManagementSystem.model.Student;
import com.aaslin.SpringMVC.StudentManagementSystem.exception.StudentNotFoundException;

import java.util.*;

@Service
public class StudentService implements StudentServices {

    private final Map<Integer, Student> store = new HashMap<>();
    private int idCounter = 0;

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Student findById(int id) {
        Student student = store.get(id);
        if (student == null) {
            throw new StudentNotFoundException(id);
        }
        return student;
    }

    @Override
    public Student create(Student student) {
        idCounter++;
        student.setId(idCounter);
        store.put(student.getId(), student);
        return student;
    }

    @Override
    public Student update(int id, Student updated) {
        if (!store.containsKey(id)) {
            throw new StudentNotFoundException(id);
        }
        updated.setId(id);
        store.put(id, updated);
        return updated;
    }

    @Override
    public void delete(int id) {
        if (!store.containsKey(id)) {
            throw new StudentNotFoundException(id);
        }
        store.remove(id);
    }
}
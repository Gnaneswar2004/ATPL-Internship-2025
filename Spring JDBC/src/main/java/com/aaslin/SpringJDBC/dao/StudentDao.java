package com.aaslin.SpringJDBC.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aaslin.SpringJDBC.model.Student;

@Repository
public class StudentDao {

	private final JdbcTemplate jdbcTemplate;

	public StudentDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int addStudent(Student student) {
		String query = "insert into student (name, email, dept) values (?, ?, ?);";
		return jdbcTemplate.update(query, student.getName(), student.getEmail(), student.getDept());
	}
	
	public List<Student> listStudents() {
		String query = "select * from student;";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Student.class));
	}
}
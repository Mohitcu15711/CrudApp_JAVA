package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

public class StudentController {
	
	@Autowired
	StudentRepository repos;
	
	//localhost:8080/student/add
	
	@PostMapping("student/add")
	
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
	
	Student nwstudent = repos.save(student);	
	
	return ResponseEntity.status(HttpStatus.CREATED).body(nwstudent);
		
	}
	
	
	

}

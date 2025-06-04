package com.kiet.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.model.Student;
import com.kiet.service.StudentService;
@RestController
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	//http://localhost:9090/students
	@RequestMapping("/students")
	public List<Student> getAllStudent(){
		return service.retrieveAll();
	}

}

package com.kiet.AIML_2B_FirstRestAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.AIML_2B_FirstRestAPI.model.Student;
import com.kiet.AIML_2B_FirstRestAPI.service.StudentService;

@RestController
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping("/students")
	public List<Student> getAllStudent() {
		return service.retrieveAllStudent();
	}
	//http://localhost:9090/students/101
	//Path Variable
	@RequestMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.retrieveStudentByid(id);
	}

}

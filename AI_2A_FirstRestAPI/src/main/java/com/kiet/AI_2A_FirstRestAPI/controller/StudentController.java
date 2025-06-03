package com.kiet.AI_2A_FirstRestAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.AI_2A_FirstRestAPI.StudentService;
import com.kiet.AI_2A_FirstRestAPI.model.Student;

@RestController
public class StudentController {

	private StudentService service;
	
	
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}


	@RequestMapping("/students")
	//toreturn All The students
	public List<Student> getAllStudents() {
		return service.reteriveAllStudents();
	}
}

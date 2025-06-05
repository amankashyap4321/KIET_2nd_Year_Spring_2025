package com.kiet;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

//http://localhost:port/students
	@RequestMapping("/students")
	public List<Student> getAllStudent() {
		return service.retrieveAll();
	}
	
	//http://localhost:port/students/101
	@RequestMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.reteriveByid(id);
	}
	
	
	
	
	
	
	
}

package com.kiet.AIML_2A_FirstRestAPI;

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

	// http://localhost:8080/students
	@RequestMapping("/students")
	public List<Student> getAll() {
			return service.getAllStudent();
	}
	//http://localhost:8080/students/101
	//Path Variable
	@RequestMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.retrieveStudentById(id);
	}
	
	
	
	
	
}

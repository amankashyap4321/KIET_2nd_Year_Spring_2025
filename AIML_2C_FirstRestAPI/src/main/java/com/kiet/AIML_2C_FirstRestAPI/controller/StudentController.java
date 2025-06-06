package com.kiet.AIML_2C_FirstRestAPI.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.AIML_2C_FirstRestAPI.model.Student;
import com.kiet.AIML_2C_FirstRestAPI.service.StudentService;

//@RestController
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}


	@GetMapping("/students/{id}")
	public Student getStudent( @PathVariable int id) {
		return service.retrieveStudentById(id);
	}
	@DeleteMapping("/students/{id}")
	public void removeStudent( @PathVariable int id) {
		service.remove(id);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return service.getAll();
	}
	
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
}

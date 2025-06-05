package com.kiet.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.model.Student;
import com.kiet.service.StudentService;

import jakarta.annotation.PostConstruct;

//@RestController
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	// http://localhost:9090/students
//	@RequestMapping(path={"/students"},method=RequestMethod.POST)
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return service.retrieveAll();
	}
	@PostMapping("/students")
	public Student storeStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}

	// http://localhost:port/students/101
//	@RequestMapping("/students/{id}")
	@GetMapping("/students/{id}")
	public Student getStudentByid(@PathVariable int id) {
		return service.retrieveById(id);
	}
	
	
	@DeleteMapping("/students/{id}")
	public void removeStudent(@PathVariable int id) {
		 service.removebyid(id);
	}
}

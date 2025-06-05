package com.kiet.AIML_2A_FirstRestAPI;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	// http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getAll() {
			return service.getAllStudent();
	}
	//http://localhost:8080/students/101
	//Path Variable
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.retrieveStudentById(id);
	}
	
	@PostMapping("/students")
	public Student storeStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@DeleteMapping("/students/{id}")
	public void remove(@PathVariable int id) {
		service.removeById(id);
	}
	
	
	
	
}

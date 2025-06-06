package com.kiet;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

//http://localhost:9090/students
	@GetMapping(path = {"/students"})
	public List<Student> getAllStudent() {
		return service.retrieveAll();
	}
	
	//http://localhost:9090/students/101
	@RequestMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.reteriveByid(id);
	}
	//http://localhost:9090/students
	@PostMapping(path = {"/students"})
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	//http://localhost:9090/students/101
	@DeleteMapping("/students/{id}")
	public void removeStudent(@PathVariable int id) {
		 service.removeById(id);
	}
	
	
	

}

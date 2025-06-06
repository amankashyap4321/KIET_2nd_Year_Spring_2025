package com.kiet.AIML_2C_FirstRestAPI.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstRestController {
	private StudentRepository repository;
	
	public FirstRestController(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(101,"rahul","java","9015088066"));
		repository.save(new Student(102,"yash","java","9015088066"));
		repository.save(new Student(103,"siddhartha","java","9015088066"));
		repository.save(new Student(104,"swasti","java","9015088066"));
		repository.save(new Student(105,"sharad","java","9015088066"));
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello Rahul";
	}

	@RequestMapping("/students/{id}")
	public Student getStudent( @PathVariable int id) {
		return repository.findById(id).get();
	}
	
	@RequestMapping("/students")
	public List<Student> getAllStudent() {
		return repository.findAll();
	}
}

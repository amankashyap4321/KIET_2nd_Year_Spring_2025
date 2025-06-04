package com.kiet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiet.model.Student;

@RestController
public class FirstRestController {

	@RequestMapping("/hello")
	public String Hello() {
		return "Hello User This is The First Call";
	}
	
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Rahul","Java","9015088066");
	}
}

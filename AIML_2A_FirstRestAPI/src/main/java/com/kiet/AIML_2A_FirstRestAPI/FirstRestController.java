package com.kiet.AIML_2A_FirstRestAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello Rahul";
	}
	//http://localhost:8080/student
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Rahul","Java","9015088066");
	}
}

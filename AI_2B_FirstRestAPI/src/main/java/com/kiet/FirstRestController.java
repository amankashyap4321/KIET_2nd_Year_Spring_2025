package com.kiet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "This is Rahul First Rest Application";
	}
	@RequestMapping("/student")
	public Student getStudent() {
		return new Student(101,"Rahul","JAVA","9015088066");
	}

}

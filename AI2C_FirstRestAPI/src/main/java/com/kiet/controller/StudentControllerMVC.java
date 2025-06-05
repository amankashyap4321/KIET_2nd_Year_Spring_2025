package com.kiet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kiet.model.Student;
import com.kiet.service.StudentService;

@Controller
public class StudentControllerMVC {

	private StudentService service;

	public StudentControllerMVC(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/student")
	public String getStudent(Model model) {
		Student student = new Student(101,"Rahul","Java","9015088066");
		model.addAttribute("stud", student);
		return "index";
	}
}

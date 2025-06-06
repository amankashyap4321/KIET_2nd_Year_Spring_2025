package com.kiet.AIML_2C_FirstRestAPI.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kiet.AIML_2C_FirstRestAPI.model.Student;
import com.kiet.AIML_2C_FirstRestAPI.service.StudentService;

@Controller
public class StudentControllerMVC {
	private StudentService service;

	public StudentControllerMVC(StudentService service) {
		super();
		this.service = service;
	}
//http://localhost:9090/students/add
	@GetMapping("/students/add")
	public String addPage( Model model) {
		Student stud=  new Student();
		model.addAttribute("student", stud);
		return "addStudent";
	}

	@GetMapping("/students/{id}")
	public String getStudent( Model model,@PathVariable int id) {
		Student stud=  service.retrieveStudentById(id);
		model.addAttribute("student", stud);
		return "demo";
	}
//	http://localhost:9090/students/delete/0
	@GetMapping("/students/delete/{id}")
	public String removeStudent( @PathVariable int id) {
		service.remove(id);
		return "redirect:/students";
	}
//	
	@GetMapping("/students")
	public String getAllStudent(Model model) {
		model.addAttribute("students", service.getAll());
		return "index";
		
	}
//	
//http://localhost:9090/students/add
	@PostMapping("/students/add")
	public String addStudent(@ModelAttribute Student student) {
		service.saveStudent(student);
		return "redirect:/students";
	}
}

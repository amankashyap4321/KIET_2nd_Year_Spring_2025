package com.kiet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kiet.model.Student;
import com.kiet.service.StudentService;

@Controller
public class StudentControllerMVC {

	private StudentService service;

	public StudentControllerMVC(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/student/{id}")
	public String getStudent(Model model, @PathVariable int id) {
		Student student = service.retrieveById(id);
		model.addAttribute("stud", student);
		return "index";
	}
	@GetMapping(path={"students","/"})
	public String getAllStudent(Model model) {
		model.addAttribute("students",service.retrieveAll());
		return "index";
	}
	
	@GetMapping("/addStudent")
	public String addStudent(Model model) {
		model.addAttribute("student",new Student());
		return "update";
	}
	@PostMapping("/save")
	public String insertStudent(@ModelAttribute Student student) {
		
		service.addStudent(student);
		
		return "redirect:/";
	}
	
	@GetMapping("/showFormUpdate/{id}")
	public String addStudent(Model model, @PathVariable int id) {
		Student student =  service.retrieveById(id);
		model.addAttribute("student",student);
		return "update";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(Model model, @PathVariable int id) {
		service.removebyid(id);
	
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
}

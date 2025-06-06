package com.kiet;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentControllerMVC {
	private StudentService service;

	public StudentControllerMVC(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/students/{id}")
	public String getStudent(Model model,@PathVariable int id) {
		Student stud = service.reteriveByid(id);
		model.addAttribute("student",stud);
			return "index";
	}
	
	@GetMapping("/students")
	public String getAllStudent(Model model) {
		List<Student> studs = service.retrieveAll();
		model.addAttribute("students",studs);
			return "demo";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.kiet.AIML_2B_FirstRestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiet.AIML_2B_FirstRestAPI.StudentRepositry;
import com.kiet.AIML_2B_FirstRestAPI.model.Student;

@Service
public class StudentService {

	private StudentRepositry repository;

	public StudentService(StudentRepositry repository) {
		super();
		this.repository = repository;
		repository.save(new Student(101,"Rahul","Java","9015088066"));
		repository.save(new Student(102,"Harsh","Java","9015088066"));
		repository.save(new Student(103,"Geetanshi","Java","9015088066"));
		repository.save(new Student(104,"kartik","Java","9015088066"));
	}

	public List<Student> retrieveAllStudent() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
}

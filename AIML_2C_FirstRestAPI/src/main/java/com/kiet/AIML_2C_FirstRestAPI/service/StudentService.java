package com.kiet.AIML_2C_FirstRestAPI.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiet.AIML_2C_FirstRestAPI.model.Student;
import com.kiet.AIML_2C_FirstRestAPI.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
	}

	public Student retrieveStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}

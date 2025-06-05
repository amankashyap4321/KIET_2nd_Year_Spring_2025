package com.kiet.AIML_2A_FirstRestAPI;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(101,"Rahul","java","9015088066"));
		repository.save(new Student(102,"Roshan","java","9015088066"));
		repository.save(new Student(103,"Himanshu","java","9015088066"));
		repository.save(new Student(104,"Ayush","java","9015088066"));
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Student retrieveStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

}

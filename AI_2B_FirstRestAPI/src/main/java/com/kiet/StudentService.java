package com.kiet;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	private StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(101,"rahul","Java","9015088066"));
		repository.save(new Student(102,"harsh","Java","9015088066"));
		repository.save(new Student(103,"naman","Java","9015088066"));
		repository.save(new Student(104,"itisha","Java","9015088066"));
	}

	public List<Student> retrieveAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Student reteriveByid(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

}

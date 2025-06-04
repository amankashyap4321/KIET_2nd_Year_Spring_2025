package com.kiet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiet.model.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer>{

}

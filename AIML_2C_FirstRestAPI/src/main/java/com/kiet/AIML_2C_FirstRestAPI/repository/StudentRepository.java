package com.kiet.AIML_2C_FirstRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiet.AIML_2C_FirstRestAPI.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

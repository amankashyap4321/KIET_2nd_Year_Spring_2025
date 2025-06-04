package com.kiet.AIML_2B_FirstRestAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiet.AIML_2B_FirstRestAPI.model.Student;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer> {

}

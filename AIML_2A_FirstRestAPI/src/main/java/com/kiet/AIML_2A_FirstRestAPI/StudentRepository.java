package com.kiet.AIML_2A_FirstRestAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//in first Argument we have to write Managed Entity
//and in second Argument we have to write datatype of id
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}

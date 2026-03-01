package com.practiceSpringJPA.SpringJPApro.repository;

import com.practiceSpringJPA.SpringJPApro.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

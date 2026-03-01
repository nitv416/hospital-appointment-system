package com.practiceSpringJPA.SpringJPApro.repository;

import com.practiceSpringJPA.SpringJPApro.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}

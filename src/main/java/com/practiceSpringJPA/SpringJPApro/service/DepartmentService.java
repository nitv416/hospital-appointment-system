package com.practiceSpringJPA.SpringJPApro.service;

import com.practiceSpringJPA.SpringJPApro.entity.Department;
import com.practiceSpringJPA.SpringJPApro.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}

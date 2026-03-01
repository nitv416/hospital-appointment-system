package com.practiceSpringJPA.SpringJPApro.controller;

import com.practiceSpringJPA.SpringJPApro.dto.CreateStudentRequest;
import com.practiceSpringJPA.SpringJPApro.entity.Student;
import com.practiceSpringJPA.SpringJPApro.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody CreateStudentRequest request) {
        return studentService.createStudent(request);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}

package com.practiceSpringJPA.SpringJPApro.service;

import com.practiceSpringJPA.SpringJPApro.dto.CreateStudentRequest;
import com.practiceSpringJPA.SpringJPApro.entity.Course;
import com.practiceSpringJPA.SpringJPApro.entity.Department;
import com.practiceSpringJPA.SpringJPApro.entity.Profile;
import com.practiceSpringJPA.SpringJPApro.entity.Student;
import com.practiceSpringJPA.SpringJPApro.repository.CourseRepository;
import com.practiceSpringJPA.SpringJPApro.repository.DepartmentRepository;
import com.practiceSpringJPA.SpringJPApro.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;
    private final CourseRepository courseRepository;

    public Student createStudent(CreateStudentRequest request) {

        Department department = departmentRepository.findById(request.getDepartmentId())
                .orElseThrow(() -> new RuntimeException("Department not found"));

        List<Course> courses = courseRepository.findAllById(request.getCourseIds());

        Profile profile = new Profile();
        profile.setEmail(request.getEmail());
        profile.setPhone(request.getPhone());

        Student student = new Student();
        student.setName(request.getName());
        student.setProfile(profile);
        student.setDepartment(department);
        student.setCourses(courses);

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
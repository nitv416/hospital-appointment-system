package com.practiceSpringJPA.SpringJPApro.service;

import com.practiceSpringJPA.SpringJPApro.entity.Course;
import com.practiceSpringJPA.SpringJPApro.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}

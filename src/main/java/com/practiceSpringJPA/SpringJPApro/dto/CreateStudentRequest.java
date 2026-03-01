package com.practiceSpringJPA.SpringJPApro.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreateStudentRequest {

    private String name;
    private String email;
    private String phone;
    private Long departmentId;
    private List<Long> courseIds;
}
package com.practiceSpringJPA.SpringJPApro.repository;

import com.practiceSpringJPA.SpringJPApro.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface InsuranceRrepository extends JpaRepository<Insurance, Long> {
}
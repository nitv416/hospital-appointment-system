package com.practiceSpringJPA.SpringJPApro.repository;

import com.practiceSpringJPA.SpringJPApro.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long > {
}

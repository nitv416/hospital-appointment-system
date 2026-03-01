package com.practiceSpringJPA.SpringJPApro.repository;

import com.practiceSpringJPA.SpringJPApro.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
}

package com.va.week5.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.va.week5.model.Enrollment;

public interface EnrollmentRepo extends JpaRepository<Enrollment, Integer>{

}

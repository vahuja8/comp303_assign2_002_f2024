package com.va.week5.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.va.week5.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}

package com.va.week5.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.va.week5.model.Program;

public interface ProgramRepo extends JpaRepository <Program,Integer>
//public interface ProgramRepo extends CrudRepository <Program, String>

{

}

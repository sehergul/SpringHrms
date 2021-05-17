package com.example.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrmsSpring.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer>{

}

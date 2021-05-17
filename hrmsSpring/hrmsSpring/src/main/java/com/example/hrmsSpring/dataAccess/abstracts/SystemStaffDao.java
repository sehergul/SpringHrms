package com.example.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrmsSpring.entities.concretes.SystemStaff;


public interface SystemStaffDao extends JpaRepository<SystemStaff, Integer>{

}

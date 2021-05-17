package com.example.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrmsSpring.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{

}

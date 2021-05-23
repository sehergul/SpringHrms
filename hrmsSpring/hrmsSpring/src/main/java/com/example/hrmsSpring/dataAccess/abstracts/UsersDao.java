package com.example.hrmsSpring.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrmsSpring.entities.concretes.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{

//interface, interface'i extend eder
//JpaRepository<'Entity' annotation ile suslenmis nesne, primary veri turu>
//JpaRepository<Hangi tablo için çalışacak, oradaki primary veri türü nedir> 
  
}

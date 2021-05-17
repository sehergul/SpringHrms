package com.example.hrmsSpring.business.abstracts;

import java.util.List;

import com.example.hrmsSpring.entities.concretes.SystemStaff;

public interface SystemStaffService {
	
	List<SystemStaff> getAll();
}

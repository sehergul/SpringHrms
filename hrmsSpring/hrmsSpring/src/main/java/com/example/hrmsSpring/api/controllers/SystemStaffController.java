package com.example.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsSpring.business.abstracts.SystemStaffService;
import com.example.hrmsSpring.entities.concretes.SystemStaff;

@RestController
@RequestMapping("/api/system_staff")
public class SystemStaffController {

	private SystemStaffService systemStaffService;

	@Autowired
	public SystemStaffController(SystemStaffService systemStaffService) {
		super();
		this.systemStaffService = systemStaffService;
	}
	
	@GetMapping("/getall")
	public List<SystemStaff> getAll(){
		return this.systemStaffService.getAll();
	}
	
	
	
}

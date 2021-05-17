package com.example.hrmsSpring.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsSpring.business.abstracts.JobSeekersService;
import com.example.hrmsSpring.entities.concretes.JobSeekers;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	
	private JobSeekersService jobSeekersService;

	@Autowired
	public JobSeekersController(JobSeekersService jobSeekersService) {
		super();
		this.jobSeekersService = jobSeekersService;
	}
	
	@GetMapping("/getall")
	public List<JobSeekers> getAll(){
		return this.jobSeekersService.getAll();
		
	}

}

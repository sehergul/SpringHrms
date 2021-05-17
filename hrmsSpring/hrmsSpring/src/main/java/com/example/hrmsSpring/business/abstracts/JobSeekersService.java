package com.example.hrmsSpring.business.abstracts;

import java.util.List;

import com.example.hrmsSpring.entities.concretes.JobSeekers;

public interface JobSeekersService {

	List<JobSeekers> getAll();
}

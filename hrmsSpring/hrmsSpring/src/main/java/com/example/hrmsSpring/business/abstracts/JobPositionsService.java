package com.example.hrmsSpring.business.abstracts;

import java.util.List;

import com.example.hrmsSpring.entities.concretes.JobPositions;

public interface JobPositionsService {
	
	List<JobPositions> getAll();

}

package com.example.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsSpring.business.abstracts.JobPositionsService;
import com.example.hrmsSpring.dataAccess.abstracts.JobPositionsDao;
import com.example.hrmsSpring.entities.concretes.JobPositions;

@Service
public class JobPositionsManager implements JobPositionsService{

	private JobPositionsDao jobPositionDao;
	
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}
	
	@Override
	public List<JobPositions> getAll() {
		return this.jobPositionDao.findAll();
	}

	
	
	

}

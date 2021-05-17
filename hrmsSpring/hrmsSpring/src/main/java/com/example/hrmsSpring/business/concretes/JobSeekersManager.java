package com.example.hrmsSpring.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrmsSpring.business.abstracts.JobSeekersService;
import com.example.hrmsSpring.dataAccess.abstracts.JobSeekersDao;
import com.example.hrmsSpring.entities.concretes.JobSeekers;

@Service
public class JobSeekersManager implements JobSeekersService{

	private JobSeekersDao jobSeekersDao;

	@Autowired
	public JobSeekersManager(JobSeekersDao jobSeekersDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
	}

	@Override
	public List<JobSeekers> getAll() {
		return this.jobSeekersDao.findAll();
	}
	
	
	
	
	
}
